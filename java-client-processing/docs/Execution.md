
# Execution

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**identifier** | **String** | execution id. Must always be present in responses. |  [optional]
**name** | **String** | execution name | 
**pipelineIdentifier** | **String** | which pipeline that started this execution | 
**timeout** | **Long** | The timeout in seconds until which the execution is killed and deleted with all its files. 0 or absense means no timeout |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | The status of the execution. Must always be present in responses. |  [optional]
**inputValues** | **Object** | Represents the input as a key/value object. The types should respect the parameters of the pipeline used for the execution. | 
**returnedFiles** | [**Map&lt;String, List&lt;String&gt;&gt;**](List.md) | Absent when not available (e.g. execution still running). Empty if no returned file is produced. Each key/value of the \&quot;returnedFiles\&quot; object corresponds to an output pipeline parameter (with \&quot;isReturnedValue\&quot; set to true) and the key must be the parameter name. The value must be an array of valid URL strings. A value array can be empty if the output parameter produces no value. It can have several URLs entries when the output is a directory with several files, a big file split in several download links, several files or any other implementation specific design. |  [optional]
**studyIdentifier** | **String** |  |  [optional]
**errorCode** | **Long** |  |  [optional]
**startDate** | **Long** | Time in seconds since Unix epoch |  [optional]
**endDate** | **Long** | Time in seconds since Unix epoch |  [optional]


<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
INITIALIZING | &quot;initializing&quot;
READY | &quot;ready&quot;
RUNNING | &quot;running&quot;
FINISHED | &quot;finished&quot;
INITIALIZATION_FAILED | &quot;initialization_failed&quot;
EXECUTION_FAILED | &quot;execution_failed&quot;
UNKNOWN | &quot;unknown&quot;
KILLED | &quot;killed&quot;



