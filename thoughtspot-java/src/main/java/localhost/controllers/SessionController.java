/*
 * RESTAPISDKLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package localhost.controllers;

import com.fasterxml.jackson.core.JsonProcessingException;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import localhost.ApiHelper;
import localhost.AuthManager;
import localhost.Configuration;
import localhost.exceptions.ApiException;
import localhost.exceptions.ErrorResponseException;
import localhost.http.Headers;
import localhost.http.client.HttpCallback;
import localhost.http.client.HttpClient;
import localhost.http.client.HttpContext;
import localhost.http.request.HttpRequest;
import localhost.http.response.HttpResponse;
import localhost.http.response.HttpStringResponse;
import localhost.models.SessionLoginResponse;
import localhost.models.TspublicRestV2SessionGettokenRequest;
import localhost.models.TspublicRestV2SessionLoginRequest;
import localhost.models.TspublicRestV2SessionOrgRequest;

/**
 * This class lists all the endpoints of the groups.
 */
public final class SessionController extends BaseController {

    /**
     * Initializes the controller.
     * @param config    Configurations added in client.
     * @param httpClient    Send HTTP requests and read the responses.
     * @param authManagers    Apply authorization to requests.
     */
    public SessionController(Configuration config, HttpClient httpClient,
            Map<String, AuthManager> authManagers) {
        super(config, httpClient, authManagers);
    }

    /**
     * Initializes the controller with HTTPCallback.
     * @param config    Configurations added in client.
     * @param httpClient    Send HTTP requests and read the responses.
     * @param authManagers    Apply authorization to requests.
     * @param httpCallback    Callback to be called before and after the HTTP call.
     */
    public SessionController(Configuration config, HttpClient httpClient,
            Map<String, AuthManager> authManagers, HttpCallback httpCallback) {
        super(config, httpClient, authManagers, httpCallback);
    }

    /**
     * To get session object information, use this endpoint.
     * @return    Returns the Object response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public Object getSessionInfo() throws ApiException, IOException {
        HttpRequest request = buildGetSessionInfoRequest();
        authManagers.get("global").apply(request);

        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleGetSessionInfoResponse(context);
    }

    /**
     * To get session object information, use this endpoint.
     * @return    Returns the Object response from the API call
     */
    public CompletableFuture<Object> getSessionInfoAsync() {
        return makeHttpCallAsync(() -> buildGetSessionInfoRequest(),
            req -> authManagers.get("global").applyAsync(req)
                .thenCompose(request -> getClientInstance()
                        .executeAsync(request, false)),
            context -> handleGetSessionInfoResponse(context));
    }

    /**
     * Builds the HttpRequest object for getSessionInfo.
     */
    private HttpRequest buildGetSessionInfoRequest() {
        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/tspublic/rest/v2/session");

        //load all headers for the outgoing API request
        Headers headers = new Headers();
        headers.add("Accept-Language", config.getAcceptLanguage());
        headers.add("Content-Type", config.getContentType());
        headers.add("user-agent", BaseController.userAgent);
        headers.add("accept", "application/json");

        //prepare and invoke the API call request to fetch the response
        HttpRequest request = getClientInstance().get(queryBuilder, headers, null, null);

        // Invoke the callback before request if its not null
        if (getHttpCallback() != null) {
            getHttpCallback().onBeforeRequest(request);
        }

        return request;
    }

    /**
     * Processes the response for getSessionInfo.
     * @return An object of type Object
     */
    private Object handleGetSessionInfoResponse(
            HttpContext context) throws ApiException, IOException {
        HttpResponse response = context.getResponse();

        //invoke the callback after response if its not null
        if (getHttpCallback() != null) {
            getHttpCallback().onAfterResponse(context);
        }

        //Error handling using HTTP status codes
        int responseCode = response.getStatusCode();

        if (responseCode == 500) {
            throw new ErrorResponseException("Operation failed or unauthorized request", context);
        }
        //handle errors defined at the API level
        validateResponse(response, context);

        //extract result from the http response
        String responseBody = ((HttpStringResponse) response).getBody();
        Object result = responseBody;

        return result;
    }

    /**
     * You can programmatically create login session for a user in ThoughtSpot using this endpoint.
     * You can create session by either providing userName and password as inputs in this request
     * body or by including "Authorization" header with the token generated through the endpoint
     * /tspublic/rest/v2/session/getToken. userName and password input is given precedence over
     * "Authorization" header, when both are included in the request.
     * @param  body  Required parameter: Example:
     * @return    Returns the SessionLoginResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public SessionLoginResponse login(
            final TspublicRestV2SessionLoginRequest body) throws ApiException, IOException {
        HttpRequest request = buildLoginRequest(body);
        authManagers.get("global").apply(request);

        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleLoginResponse(context);
    }

    /**
     * You can programmatically create login session for a user in ThoughtSpot using this endpoint.
     * You can create session by either providing userName and password as inputs in this request
     * body or by including "Authorization" header with the token generated through the endpoint
     * /tspublic/rest/v2/session/getToken. userName and password input is given precedence over
     * "Authorization" header, when both are included in the request.
     * @param  body  Required parameter: Example:
     * @return    Returns the SessionLoginResponse response from the API call
     */
    public CompletableFuture<SessionLoginResponse> loginAsync(
            final TspublicRestV2SessionLoginRequest body) {
        return makeHttpCallAsync(() -> buildLoginRequest(body),
            req -> authManagers.get("global").applyAsync(req)
                .thenCompose(request -> getClientInstance()
                        .executeAsync(request, false)),
            context -> handleLoginResponse(context));
    }

    /**
     * Builds the HttpRequest object for login.
     */
    private HttpRequest buildLoginRequest(
            final TspublicRestV2SessionLoginRequest body) throws JsonProcessingException {
        //validating required parameters
        if (null == body) {
            throw new NullPointerException("The parameter \"body\" is a required parameter and cannot be null.");
        }

        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/tspublic/rest/v2/session/login");

        //load all headers for the outgoing API request
        Headers headers = new Headers();
        headers.add("Content-Type", "application/json");
        headers.add("Accept-Language", config.getAcceptLanguage());
        headers.add("user-agent", BaseController.userAgent);
        headers.add("accept", "application/json");

        //prepare and invoke the API call request to fetch the response
        String bodyJson = ApiHelper.serialize(body);
        HttpRequest request = getClientInstance().postBody(queryBuilder, headers, null, bodyJson);

        // Invoke the callback before request if its not null
        if (getHttpCallback() != null) {
            getHttpCallback().onBeforeRequest(request);
        }

        return request;
    }

    /**
     * Processes the response for login.
     * @return An object of type SessionLoginResponse
     */
    private SessionLoginResponse handleLoginResponse(
            HttpContext context) throws ApiException, IOException {
        HttpResponse response = context.getResponse();

        //invoke the callback after response if its not null
        if (getHttpCallback() != null) {
            getHttpCallback().onAfterResponse(context);
        }

        //Error handling using HTTP status codes
        int responseCode = response.getStatusCode();

        if (responseCode == 500) {
            throw new ErrorResponseException("Operation failed or unauthorized request", context);
        }
        //handle errors defined at the API level
        validateResponse(response, context);

        //extract result from the http response
        String responseBody = ((HttpStringResponse) response).getBody();
        SessionLoginResponse result = ApiHelper.deserialize(responseBody,
                SessionLoginResponse.class);

        return result;
    }

    /**
     * To log a user out of the current session, use this endpoint.
     * @return    Returns the Boolean response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public Boolean logout() throws ApiException, IOException {
        HttpRequest request = buildLogoutRequest();
        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleLogoutResponse(context);
    }

    /**
     * To log a user out of the current session, use this endpoint.
     * @return    Returns the Boolean response from the API call
     */
    public CompletableFuture<Boolean> logoutAsync() {
        return makeHttpCallAsync(() -> buildLogoutRequest(),
            request -> getClientInstance().executeAsync(request, false),
            context -> handleLogoutResponse(context));
    }

    /**
     * Builds the HttpRequest object for logout.
     */
    private HttpRequest buildLogoutRequest() {
        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/tspublic/rest/v2/session/logout");

        //load all headers for the outgoing API request
        Headers headers = new Headers();
        headers.add("Accept-Language", config.getAcceptLanguage());
        headers.add("Content-Type", config.getContentType());

        headers.add("user-agent", BaseController.userAgent);

        //prepare and invoke the API call request to fetch the response
        HttpRequest request = getClientInstance().post(queryBuilder, headers, null, null);

        // Invoke the callback before request if its not null
        if (getHttpCallback() != null) {
            getHttpCallback().onBeforeRequest(request);
        }

        return request;
    }

    /**
     * Processes the response for logout.
     * @return An object of type boolean
     */
    private Boolean handleLogoutResponse(
            HttpContext context) throws ApiException, IOException {
        HttpResponse response = context.getResponse();

        //invoke the callback after response if its not null
        if (getHttpCallback() != null) {
            getHttpCallback().onAfterResponse(context);
        }

        //Error handling using HTTP status codes
        int responseCode = response.getStatusCode();

        if (responseCode == 500) {
            throw new ErrorResponseException("Operation failed or unauthorized request", context);
        }
        //handle errors defined at the API level
        validateResponse(response, context);

        //extract result from the http response
        String responseBody = ((HttpStringResponse) response).getBody();
        boolean result = Boolean.parseBoolean(responseBody);

        return result;
    }

    /**
     * To programmatically create session token for a user in ThoughtSpot, use this endpoint. You
     * can generate the token for a user by providing password or secret key from the cluster. You
     * need to enable trusted authentication to generate secret key. To generate secret key, follow
     * below steps. 1. Click the Develop tab. 2. Under Customizations, click Settings. 3. To enable
     * trusted authentication, turn on the toggle. 4. A secret_key for trusted authentication is
     * generated. 5. Click the clipboard icon to copy the token. Password is given precedence over
     * secretKey input, when both are included in the request.
     * @param  body  Required parameter: Example:
     * @return    Returns the SessionLoginResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public SessionLoginResponse getToken(
            final TspublicRestV2SessionGettokenRequest body) throws ApiException, IOException {
        HttpRequest request = buildGetTokenRequest(body);
        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleGetTokenResponse(context);
    }

    /**
     * To programmatically create session token for a user in ThoughtSpot, use this endpoint. You
     * can generate the token for a user by providing password or secret key from the cluster. You
     * need to enable trusted authentication to generate secret key. To generate secret key, follow
     * below steps. 1. Click the Develop tab. 2. Under Customizations, click Settings. 3. To enable
     * trusted authentication, turn on the toggle. 4. A secret_key for trusted authentication is
     * generated. 5. Click the clipboard icon to copy the token. Password is given precedence over
     * secretKey input, when both are included in the request.
     * @param  body  Required parameter: Example:
     * @return    Returns the SessionLoginResponse response from the API call
     */
    public CompletableFuture<SessionLoginResponse> getTokenAsync(
            final TspublicRestV2SessionGettokenRequest body) {
        return makeHttpCallAsync(() -> buildGetTokenRequest(body),
            request -> getClientInstance().executeAsync(request, false),
            context -> handleGetTokenResponse(context));
    }

    /**
     * Builds the HttpRequest object for getToken.
     */
    private HttpRequest buildGetTokenRequest(
            final TspublicRestV2SessionGettokenRequest body) throws JsonProcessingException {
        //validating required parameters
        if (null == body) {
            throw new NullPointerException("The parameter \"body\" is a required parameter and cannot be null.");
        }

        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/tspublic/rest/v2/session/gettoken");

        //load all headers for the outgoing API request
        Headers headers = new Headers();
        headers.add("Content-Type", "application/json");
        headers.add("Accept-Language", config.getAcceptLanguage());

        headers.add("user-agent", BaseController.userAgent);
        headers.add("accept", "application/json");

        //prepare and invoke the API call request to fetch the response
        String bodyJson = ApiHelper.serialize(body);
        HttpRequest request = getClientInstance().postBody(queryBuilder, headers, null, bodyJson);

        // Invoke the callback before request if its not null
        if (getHttpCallback() != null) {
            getHttpCallback().onBeforeRequest(request);
        }

        return request;
    }

    /**
     * Processes the response for getToken.
     * @return An object of type SessionLoginResponse
     */
    private SessionLoginResponse handleGetTokenResponse(
            HttpContext context) throws ApiException, IOException {
        HttpResponse response = context.getResponse();

        //invoke the callback after response if its not null
        if (getHttpCallback() != null) {
            getHttpCallback().onAfterResponse(context);
        }

        //Error handling using HTTP status codes
        int responseCode = response.getStatusCode();

        if (responseCode == 500) {
            throw new ErrorResponseException("Operation failed or unauthorized request", context);
        }
        //handle errors defined at the API level
        validateResponse(response, context);

        //extract result from the http response
        String responseBody = ((HttpStringResponse) response).getBody();
        SessionLoginResponse result = ApiHelper.deserialize(responseBody,
                SessionLoginResponse.class);

        return result;
    }

    /**
     * To expire or revoke a token for a user, use this endpoint.
     * @return    Returns the Boolean response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public Boolean revokeToken() throws ApiException, IOException {
        HttpRequest request = buildRevokeTokenRequest();
        authManagers.get("global").apply(request);

        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleRevokeTokenResponse(context);
    }

    /**
     * To expire or revoke a token for a user, use this endpoint.
     * @return    Returns the Boolean response from the API call
     */
    public CompletableFuture<Boolean> revokeTokenAsync() {
        return makeHttpCallAsync(() -> buildRevokeTokenRequest(),
            req -> authManagers.get("global").applyAsync(req)
                .thenCompose(request -> getClientInstance()
                        .executeAsync(request, false)),
            context -> handleRevokeTokenResponse(context));
    }

    /**
     * Builds the HttpRequest object for revokeToken.
     */
    private HttpRequest buildRevokeTokenRequest() {
        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/tspublic/rest/v2/session/revoketoken");

        //load all headers for the outgoing API request
        Headers headers = new Headers();
        headers.add("Accept-Language", config.getAcceptLanguage());
        headers.add("Content-Type", config.getContentType());
        headers.add("user-agent", BaseController.userAgent);

        //prepare and invoke the API call request to fetch the response
        HttpRequest request = getClientInstance().post(queryBuilder, headers, null, null);

        // Invoke the callback before request if its not null
        if (getHttpCallback() != null) {
            getHttpCallback().onBeforeRequest(request);
        }

        return request;
    }

    /**
     * Processes the response for revokeToken.
     * @return An object of type boolean
     */
    private Boolean handleRevokeTokenResponse(
            HttpContext context) throws ApiException, IOException {
        HttpResponse response = context.getResponse();

        //invoke the callback after response if its not null
        if (getHttpCallback() != null) {
            getHttpCallback().onAfterResponse(context);
        }

        //Error handling using HTTP status codes
        int responseCode = response.getStatusCode();

        if (responseCode == 500) {
            throw new ErrorResponseException("Operation failed or unauthorized request", context);
        }
        //handle errors defined at the API level
        validateResponse(response, context);

        //extract result from the http response
        String responseBody = ((HttpStringResponse) response).getBody();
        boolean result = Boolean.parseBoolean(responseBody);

        return result;
    }

    /**
     * This is endpoint is applicable only if organization feature is enabled in the cluster. To
     * programmatically switch the organization context for the logged in session, use this
     * endpoint. The original session is reused even after changing the organization. The logged in
     * user should have access to the organization being switched to. This endpoint can be used to
     * switch organization only when using session cookies for authentication.
     * @param  body  Required parameter: Example:
     * @return    Returns the Boolean response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public Boolean switchOrg(
            final TspublicRestV2SessionOrgRequest body) throws ApiException, IOException {
        HttpRequest request = buildSwitchOrgRequest(body);
        authManagers.get("global").apply(request);

        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleSwitchOrgResponse(context);
    }

    /**
     * This is endpoint is applicable only if organization feature is enabled in the cluster. To
     * programmatically switch the organization context for the logged in session, use this
     * endpoint. The original session is reused even after changing the organization. The logged in
     * user should have access to the organization being switched to. This endpoint can be used to
     * switch organization only when using session cookies for authentication.
     * @param  body  Required parameter: Example:
     * @return    Returns the Boolean response from the API call
     */
    public CompletableFuture<Boolean> switchOrgAsync(
            final TspublicRestV2SessionOrgRequest body) {
        return makeHttpCallAsync(() -> buildSwitchOrgRequest(body),
            req -> authManagers.get("global").applyAsync(req)
                .thenCompose(request -> getClientInstance()
                        .executeAsync(request, false)),
            context -> handleSwitchOrgResponse(context));
    }

    /**
     * Builds the HttpRequest object for switchOrg.
     */
    private HttpRequest buildSwitchOrgRequest(
            final TspublicRestV2SessionOrgRequest body) throws JsonProcessingException {
        //validating required parameters
        if (null == body) {
            throw new NullPointerException("The parameter \"body\" is a required parameter and cannot be null.");
        }

        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/tspublic/rest/v2/session/org");

        //load all headers for the outgoing API request
        Headers headers = new Headers();
        headers.add("Content-Type", "application/json");
        headers.add("Accept-Language", config.getAcceptLanguage());
        headers.add("user-agent", BaseController.userAgent);

        //prepare and invoke the API call request to fetch the response
        String bodyJson = ApiHelper.serialize(body);
        HttpRequest request = getClientInstance().putBody(queryBuilder, headers, null, bodyJson);

        // Invoke the callback before request if its not null
        if (getHttpCallback() != null) {
            getHttpCallback().onBeforeRequest(request);
        }

        return request;
    }

    /**
     * Processes the response for switchOrg.
     * @return An object of type boolean
     */
    private Boolean handleSwitchOrgResponse(
            HttpContext context) throws ApiException, IOException {
        HttpResponse response = context.getResponse();

        //invoke the callback after response if its not null
        if (getHttpCallback() != null) {
            getHttpCallback().onAfterResponse(context);
        }

        //Error handling using HTTP status codes
        int responseCode = response.getStatusCode();

        if (responseCode == 500) {
            throw new ErrorResponseException("Operation failed or unauthorized request", context);
        }
        //handle errors defined at the API level
        validateResponse(response, context);

        //extract result from the http response
        String responseBody = ((HttpStringResponse) response).getBody();
        boolean result = Boolean.parseBoolean(responseBody);

        return result;
    }

}