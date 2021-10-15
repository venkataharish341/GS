  We are serializing/deserializing polymorphic types with these annotations. (@JsonTypeInfo, @JsonSubTypes)
    
    Serializing:
    ------------
    While serializing, include a property named "type" and use NAME as it value (the subtype name).
    So, when we try to serialize ex: Rectangle object, its name is rectangle so, a property
    "type" :"rectangle" will be added to serialized JSON.
    Serialized JSON : {"w":3,"h":5,"name":"Rectangle","type":"rectangle"}
    
    Deserializing:
    --------------
    While Deserializing, a property named "type" will be matched with available subtype names and corresponding
    class name is found. Then object is created using default constructor and it will be filled
    with json values. That is how deserialization happens.
