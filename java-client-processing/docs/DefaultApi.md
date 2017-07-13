# DefaultApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteExecution**](DefaultApi.md#deleteExecution) | **PUT** /executions/{executionIdentifier}/delete | 
[**getExecution**](DefaultApi.md#getExecution) | **GET** /executions/{executionIdentifier} | 
[**getExecutionResults**](DefaultApi.md#getExecutionResults) | **GET** /executions/{executionIdentifier}/results | 
[**getPipeline**](DefaultApi.md#getPipeline) | **GET** /pipelines/{pipelineIdentifier} | 
[**getPlatformProperties**](DefaultApi.md#getPlatformProperties) | **GET** /platform | 
[**getStderr**](DefaultApi.md#getStderr) | **GET** /executions/{executionIdentifier}/stderr | 
[**getStdout**](DefaultApi.md#getStdout) | **GET** /executions/{executionIdentifier}/stdout | 
[**initAndStartExecution**](DefaultApi.md#initAndStartExecution) | **POST** /executions/create-and-start | 
[**initExecution**](DefaultApi.md#initExecution) | **POST** /executions | 
[**killExecution**](DefaultApi.md#killExecution) | **PUT** /executions/{executionIdentifier}/kill | 
[**listExecutions**](DefaultApi.md#listExecutions) | **GET** /executions | 
[**listPipelines**](DefaultApi.md#listPipelines) | **GET** /pipelines | 
[**playExecution**](DefaultApi.md#playExecution) | **PUT** /executions/{executionIdentifier}/play | 
[**updateExecution**](DefaultApi.md#updateExecution) | **PUT** /executions/{executionIdentifier} | 


<a name="deleteExecution"></a>
# **deleteExecution**
> deleteExecution(executionIdentifier, body)



Delete an execution. This will kill the underlying processes (if possible) and free all resources associated with this execution (depending of the configuration given in as body input).

### Example
```java
// Import classes:
//import fr.insalyon.creatis.vip.client.processing.ApiClient;
//import fr.insalyon.creatis.vip.client.processing.ApiException;
//import fr.insalyon.creatis.vip.client.processing.Configuration;
//import fr.insalyon.creatis.vip.client.processing.auth.*;
//import fr.insalyon.creatis.vip.client.processing.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String executionIdentifier = "executionIdentifier_example"; // String | 
DeleteExecutionConfiguration body = new DeleteExecutionConfiguration(); // DeleteExecutionConfiguration | delete configuration
try {
    apiInstance.deleteExecution(executionIdentifier, body);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#deleteExecution");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **executionIdentifier** | **String**|  |
 **body** | [**DeleteExecutionConfiguration**](DeleteExecutionConfiguration.md)| delete configuration | [optional]

### Return type

null (empty response body)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getExecution"></a>
# **getExecution**
> Execution getExecution(executionIdentifier)



get information about an execution

### Example
```java
// Import classes:
//import fr.insalyon.creatis.vip.client.processing.ApiClient;
//import fr.insalyon.creatis.vip.client.processing.ApiException;
//import fr.insalyon.creatis.vip.client.processing.Configuration;
//import fr.insalyon.creatis.vip.client.processing.auth.*;
//import fr.insalyon.creatis.vip.client.processing.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String executionIdentifier = "executionIdentifier_example"; // String | 
try {
    Execution result = apiInstance.getExecution(executionIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getExecution");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **executionIdentifier** | **String**|  |

### Return type

[**Execution**](Execution.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getExecutionResults"></a>
# **getExecutionResults**
> List&lt;String&gt; getExecutionResults(executionIdentifier, protocol)



get the result files of the execution

### Example
```java
// Import classes:
//import fr.insalyon.creatis.vip.client.processing.ApiClient;
//import fr.insalyon.creatis.vip.client.processing.ApiException;
//import fr.insalyon.creatis.vip.client.processing.Configuration;
//import fr.insalyon.creatis.vip.client.processing.auth.*;
//import fr.insalyon.creatis.vip.client.processing.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String executionIdentifier = "executionIdentifier_example"; // String | 
String protocol = "protocol_example"; // String | if not specified the default protocol is https
try {
    List<String> result = apiInstance.getExecutionResults(executionIdentifier, protocol);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getExecutionResults");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **executionIdentifier** | **String**|  |
 **protocol** | **String**| if not specified the default protocol is https | [optional]

### Return type

**List&lt;String&gt;**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getPipeline"></a>
# **getPipeline**
> Pipeline getPipeline(pipelineIdentifier)



Show the definition of a given pipeline

### Example
```java
// Import classes:
//import fr.insalyon.creatis.vip.client.processing.ApiClient;
//import fr.insalyon.creatis.vip.client.processing.ApiException;
//import fr.insalyon.creatis.vip.client.processing.Configuration;
//import fr.insalyon.creatis.vip.client.processing.auth.*;
//import fr.insalyon.creatis.vip.client.processing.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String pipelineIdentifier = "pipelineIdentifier_example"; // String | pipeline identifier
try {
    Pipeline result = apiInstance.getPipeline(pipelineIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getPipeline");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pipelineIdentifier** | **String**| pipeline identifier |

### Return type

[**Pipeline**](Pipeline.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getPlatformProperties"></a>
# **getPlatformProperties**
> PlatformProperties getPlatformProperties()



Returns information about the platform. https must be supported in the list of the supported protocols.

### Example
```java
// Import classes:
//import fr.insalyon.creatis.vip.client.processing.ApiException;
//import fr.insalyon.creatis.vip.client.processing.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
try {
    PlatformProperties result = apiInstance.getPlatformProperties();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getPlatformProperties");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**PlatformProperties**](PlatformProperties.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getStderr"></a>
# **getStderr**
> String getStderr(executionIdentifier)



get stderr of an execution

### Example
```java
// Import classes:
//import fr.insalyon.creatis.vip.client.processing.ApiClient;
//import fr.insalyon.creatis.vip.client.processing.ApiException;
//import fr.insalyon.creatis.vip.client.processing.Configuration;
//import fr.insalyon.creatis.vip.client.processing.auth.*;
//import fr.insalyon.creatis.vip.client.processing.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String executionIdentifier = "executionIdentifier_example"; // String | 
try {
    String result = apiInstance.getStderr(executionIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getStderr");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **executionIdentifier** | **String**|  |

### Return type

**String**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: text/plain, application/json

<a name="getStdout"></a>
# **getStdout**
> String getStdout(executionIdentifier)



get stdout of an execution

### Example
```java
// Import classes:
//import fr.insalyon.creatis.vip.client.processing.ApiClient;
//import fr.insalyon.creatis.vip.client.processing.ApiException;
//import fr.insalyon.creatis.vip.client.processing.Configuration;
//import fr.insalyon.creatis.vip.client.processing.auth.*;
//import fr.insalyon.creatis.vip.client.processing.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String executionIdentifier = "executionIdentifier_example"; // String | 
try {
    String result = apiInstance.getStdout(executionIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getStdout");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **executionIdentifier** | **String**|  |

### Return type

**String**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: text/plain, application/json

<a name="initAndStartExecution"></a>
# **initAndStartExecution**
> Execution initAndStartExecution(body)



Initializes an execution and start it. The successful response must contain the execution identifier.

### Example
```java
// Import classes:
//import fr.insalyon.creatis.vip.client.processing.ApiClient;
//import fr.insalyon.creatis.vip.client.processing.ApiException;
//import fr.insalyon.creatis.vip.client.processing.Configuration;
//import fr.insalyon.creatis.vip.client.processing.auth.*;
//import fr.insalyon.creatis.vip.client.processing.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
Execution body = new Execution(); // Execution | 
try {
    Execution result = apiInstance.initAndStartExecution(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#initAndStartExecution");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Execution**](Execution.md)|  |

### Return type

[**Execution**](Execution.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="initExecution"></a>
# **initExecution**
> Execution initExecution(body)



Initializes an execution. Does not start it. The successful response must contain the execution identifier.

### Example
```java
// Import classes:
//import fr.insalyon.creatis.vip.client.processing.ApiClient;
//import fr.insalyon.creatis.vip.client.processing.ApiException;
//import fr.insalyon.creatis.vip.client.processing.Configuration;
//import fr.insalyon.creatis.vip.client.processing.auth.*;
//import fr.insalyon.creatis.vip.client.processing.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
Execution body = new Execution(); // Execution | 
try {
    Execution result = apiInstance.initExecution(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#initExecution");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Execution**](Execution.md)|  |

### Return type

[**Execution**](Execution.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="killExecution"></a>
# **killExecution**
> killExecution(executionIdentifier)



kill an execution

### Example
```java
// Import classes:
//import fr.insalyon.creatis.vip.client.processing.ApiClient;
//import fr.insalyon.creatis.vip.client.processing.ApiException;
//import fr.insalyon.creatis.vip.client.processing.Configuration;
//import fr.insalyon.creatis.vip.client.processing.auth.*;
//import fr.insalyon.creatis.vip.client.processing.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String executionIdentifier = "executionIdentifier_example"; // String | 
try {
    apiInstance.killExecution(executionIdentifier);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#killExecution");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **executionIdentifier** | **String**|  |

### Return type

null (empty response body)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listExecutions"></a>
# **listExecutions**
> List&lt;Execution&gt; listExecutions()



list all execution Ids in the platform which are ordered in decreasing submission time. All the executions that were launched by the user must be returned. It is up to the platform to return executions that the user did not launch. When studyIdentifier is present, all the executions that the user launched in the study must be returned.

### Example
```java
// Import classes:
//import fr.insalyon.creatis.vip.client.processing.ApiClient;
//import fr.insalyon.creatis.vip.client.processing.ApiException;
//import fr.insalyon.creatis.vip.client.processing.Configuration;
//import fr.insalyon.creatis.vip.client.processing.auth.*;
//import fr.insalyon.creatis.vip.client.processing.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
try {
    List<Execution> result = apiInstance.listExecutions();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#listExecutions");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;Execution&gt;**](Execution.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listPipelines"></a>
# **listPipelines**
> List&lt;Pipeline&gt; listPipelines(studyIdentifier)



All the pipelines that the user can execute must be returned. It is up to the platform to return pipelines that the user cannot execute. When studyIdentifier is present, all the pipelines that the user can execute in the study must be returned. In this case, execution rights denote the rights to execute the pipeline in the study.

### Example
```java
// Import classes:
//import fr.insalyon.creatis.vip.client.processing.ApiClient;
//import fr.insalyon.creatis.vip.client.processing.ApiException;
//import fr.insalyon.creatis.vip.client.processing.Configuration;
//import fr.insalyon.creatis.vip.client.processing.auth.*;
//import fr.insalyon.creatis.vip.client.processing.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String studyIdentifier = "studyIdentifier_example"; // String | 
try {
    List<Pipeline> result = apiInstance.listPipelines(studyIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#listPipelines");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **studyIdentifier** | **String**|  | [optional]

### Return type

[**List&lt;Pipeline&gt;**](Pipeline.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="playExecution"></a>
# **playExecution**
> playExecution(executionIdentifier)



play an execution

### Example
```java
// Import classes:
//import fr.insalyon.creatis.vip.client.processing.ApiClient;
//import fr.insalyon.creatis.vip.client.processing.ApiException;
//import fr.insalyon.creatis.vip.client.processing.Configuration;
//import fr.insalyon.creatis.vip.client.processing.auth.*;
//import fr.insalyon.creatis.vip.client.processing.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String executionIdentifier = "executionIdentifier_example"; // String | 
try {
    apiInstance.playExecution(executionIdentifier);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#playExecution");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **executionIdentifier** | **String**|  |

### Return type

null (empty response body)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateExecution"></a>
# **updateExecution**
> updateExecution(executionIdentifier, body)



Modify an execution. Only the name and the timeout of the execution can be modified. Changes to the identifier or the status will raise errors. Changes to the other properties will be ignored.

### Example
```java
// Import classes:
//import fr.insalyon.creatis.vip.client.processing.ApiClient;
//import fr.insalyon.creatis.vip.client.processing.ApiException;
//import fr.insalyon.creatis.vip.client.processing.Configuration;
//import fr.insalyon.creatis.vip.client.processing.auth.*;
//import fr.insalyon.creatis.vip.client.processing.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String executionIdentifier = "executionIdentifier_example"; // String | 
Execution body = new Execution(); // Execution | 
try {
    apiInstance.updateExecution(executionIdentifier, body);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#updateExecution");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **executionIdentifier** | **String**|  |
 **body** | [**Execution**](Execution.md)|  |

### Return type

null (empty response body)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

