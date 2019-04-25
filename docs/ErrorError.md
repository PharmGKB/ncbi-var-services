# ErrorError

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code** | **Integer** | Represents the code for this error. This property value will represent the HTTP response code. If there are multiple errors, code will be the error code for the first error. |  [optional]
**message** | **String** | A human readable message providing more details about the error. If there are multiple errors, message will be the message for the first error. |  [optional]
**errors** | [**List&lt;DetailedError&gt;**](DetailedError.md) | Container for any additional information regarding the error. If the service returns multiple errors, each element in the errors array represents a different error. |  [optional]
