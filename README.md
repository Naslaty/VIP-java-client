# VIP-java-client

## Description
It is a java code generated by swagger codegen from the CARMIN specification (version: 0.2.1)

## Importants informations
After the code generation some parts of the code have been modified to precise fuzzy automatic generation. 
The modifications are in the following class:
<ul>
<li> Execution.java</li>
<li> PipelineParameters.java</li>
</ul>
Moreover, automatic unit tests have been implemented to verify the modication are present.

### Execution class modification
The InputValues field was an Object, now it is a Map<String, Object>

### PipelineParameters class modification
A defaultValue field of Object type has been created, and its associated setter and getter methods.
