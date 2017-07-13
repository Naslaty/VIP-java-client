# DefaultApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createPath**](DefaultApi.md#createPath) | **POST** /path/directory | 
[**deletePath**](DefaultApi.md#deletePath) | **DELETE** /path | 
[**doesPathExists**](DefaultApi.md#doesPathExists) | **GET** /path/exists | 
[**downloadFile**](DefaultApi.md#downloadFile) | **GET** /path/content | 
[**getPath**](DefaultApi.md#getPath) | **GET** /path | 
[**listDirectory**](DefaultApi.md#listDirectory) | **GET** /path/directory | 
[**uploadFile**](DefaultApi.md#uploadFile) | **PUT** /path/content | 


<a name="createPath"></a>
# **createPath**
> Path createPath(uri)



create the specified directory in user space

### Example
```java
// Import classes:
//import fr.insalyon.creatis.vip.client.data.ApiClient;
//import fr.insalyon.creatis.vip.client.data.ApiException;
//import fr.insalyon.creatis.vip.client.data.Configuration;
//import fr.insalyon.creatis.vip.client.data.auth.*;
//import fr.insalyon.creatis.vip.client.data.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String uri = "uri_example"; // String | 
try {
    Path result = apiInstance.createPath(uri);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#createPath");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uri** | **String**|  |

### Return type

[**Path**](Path.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deletePath"></a>
# **deletePath**
> deletePath(uri)



delete the specified path

### Example
```java
// Import classes:
//import fr.insalyon.creatis.vip.client.data.ApiClient;
//import fr.insalyon.creatis.vip.client.data.ApiException;
//import fr.insalyon.creatis.vip.client.data.Configuration;
//import fr.insalyon.creatis.vip.client.data.auth.*;
//import fr.insalyon.creatis.vip.client.data.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String uri = "uri_example"; // String | 
try {
    apiInstance.deletePath(uri);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#deletePath");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uri** | **String**|  |

### Return type

null (empty response body)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="doesPathExists"></a>
# **doesPathExists**
> Boolean doesPathExists(uri)



indicates if the specified path exists or not

### Example
```java
// Import classes:
//import fr.insalyon.creatis.vip.client.data.ApiClient;
//import fr.insalyon.creatis.vip.client.data.ApiException;
//import fr.insalyon.creatis.vip.client.data.Configuration;
//import fr.insalyon.creatis.vip.client.data.auth.*;
//import fr.insalyon.creatis.vip.client.data.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String uri = "uri_example"; // String | 
try {
    Boolean result = apiInstance.doesPathExists(uri);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#doesPathExists");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uri** | **String**|  |

### Return type

**Boolean**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="downloadFile"></a>
# **downloadFile**
> String downloadFile(uri)



returns the asked file

### Example
```java
// Import classes:
//import fr.insalyon.creatis.vip.client.data.ApiClient;
//import fr.insalyon.creatis.vip.client.data.ApiException;
//import fr.insalyon.creatis.vip.client.data.Configuration;
//import fr.insalyon.creatis.vip.client.data.auth.*;
//import fr.insalyon.creatis.vip.client.data.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String uri = "uri_example"; // String | 
try {
    String result = apiInstance.downloadFile(uri);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#downloadFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uri** | **String**|  |

### Return type

**String**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getPath"></a>
# **getPath**
> Path getPath(uri)



get the specified path if it exists

### Example
```java
// Import classes:
//import fr.insalyon.creatis.vip.client.data.ApiClient;
//import fr.insalyon.creatis.vip.client.data.ApiException;
//import fr.insalyon.creatis.vip.client.data.Configuration;
//import fr.insalyon.creatis.vip.client.data.auth.*;
//import fr.insalyon.creatis.vip.client.data.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String uri = "uri_example"; // String | 
try {
    Path result = apiInstance.getPath(uri);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getPath");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uri** | **String**|  |

### Return type

[**Path**](Path.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listDirectory"></a>
# **listDirectory**
> List&lt;Path&gt; listDirectory(uri)



returns all files and directory contained in the specified path

### Example
```java
// Import classes:
//import fr.insalyon.creatis.vip.client.data.ApiClient;
//import fr.insalyon.creatis.vip.client.data.ApiException;
//import fr.insalyon.creatis.vip.client.data.Configuration;
//import fr.insalyon.creatis.vip.client.data.auth.*;
//import fr.insalyon.creatis.vip.client.data.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String uri = "uri_example"; // String | 
try {
    List<Path> result = apiInstance.listDirectory(uri);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#listDirectory");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uri** | **String**|  |

### Return type

[**List&lt;Path&gt;**](Path.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="uploadFile"></a>
# **uploadFile**
> UploadData uploadFile(body)



returns the uploaded path

### Example
```java
// Import classes:
//import fr.insalyon.creatis.vip.client.data.ApiClient;
//import fr.insalyon.creatis.vip.client.data.ApiException;
//import fr.insalyon.creatis.vip.client.data.Configuration;
//import fr.insalyon.creatis.vip.client.data.auth.*;
//import fr.insalyon.creatis.vip.client.data.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
UploadData body = new UploadData(); // UploadData | 
try {
    UploadData result = apiInstance.uploadFile(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#uploadFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**UploadData**](UploadData.md)|  |

### Return type

[**UploadData**](UploadData.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

