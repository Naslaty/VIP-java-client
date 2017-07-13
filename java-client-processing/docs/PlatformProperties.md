
# PlatformProperties

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**platformName** | **String** | Name of the platform. |  [optional]
**apIErrorCodesAndMessages** | [**List&lt;ErrorCodeAndMessage&gt;**](ErrorCodeAndMessage.md) |  |  [optional]
**supportedTransferProtocols** | [**List&lt;SupportedTransferProtocolsEnum&gt;**](#List&lt;SupportedTransferProtocolsEnum&gt;) | Protocol names must be URL prefixes (e.g. \&quot;http\&quot;, \&quot;https\&quot;, \&quot;ftp\&quot;, \&quot;sftp\&quot;, \&quot;ftps\&quot;, \&quot;scp\&quot;, \&quot;webdav\&quot;). | 
**supportedModules** | [**List&lt;SupportedModulesEnum&gt;**](#List&lt;SupportedModulesEnum&gt;) |  | 
**defaultLimitListExecutions** | **Long** | The number of Executions returned by getExecutions |  [optional]
**email** | **String** |  |  [optional]
**platformDescription** | **String** |  |  [optional]
**minAuthorizedExecutionTimeout** | **Long** |  |  [optional]
**maxAuthorizedExecutionTimeout** | **Long** | 0 or absent means no max timeout. max has to be greater or equal to the min. |  [optional]
**defaultExecutionTimeout** | **Long** |  |  [optional]
**isKillExecutionSupported** | **Boolean** |  | 
**unsupportedMethods** | **List&lt;String&gt;** | List of optional methods that are not supported by the platform. Must be consistent with the \&quot;isKillExecutionSupported\&quot; property. |  [optional]
**defaultStudy** | **String** |  |  [optional]
**supportedAPIVersion** | **String** |  | 


<a name="List<SupportedTransferProtocolsEnum>"></a>
## Enum: List&lt;SupportedTransferProtocolsEnum&gt;
Name | Value
---- | -----
HTTP | &quot;http&quot;
HTTPS | &quot;https&quot;
FTP | &quot;ftp&quot;
SFTP | &quot;sftp&quot;
FTPS | &quot;ftps&quot;
SCP | &quot;scp&quot;
WEBDAV | &quot;webdav&quot;


<a name="List<SupportedModulesEnum>"></a>
## Enum: List&lt;SupportedModulesEnum&gt;
Name | Value
---- | -----
PROCESSING | &quot;Processing&quot;
DATA | &quot;Data&quot;
MANAGEMENT | &quot;Management&quot;
COMMERCIAL | &quot;Commercial&quot;



