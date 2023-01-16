package classes;

class CorrelationDictionary {

    private int correlation_key ;
    private String request ;
    private  String response;
    private int correlation_value;
    private String response_type;
    private String extraction_function;

    public CorrelationDictionary(int correlation_key, String request, String response, int correlation_value, String response_type, String extraction_function) {
        this.correlation_key = correlation_key;
        this.request = request;
        this.response = response;
        this.correlation_value = correlation_value;
        this.response_type = response_type;
        this.extraction_function = extraction_function;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "CorrelationDictionary{" +
                "correlation_key=" + correlation_key +
                ", request='" + request + '\'' +
                ", response='" + response + '\'' +
                ", correlation_value=" + correlation_value +
                ", response_type='" + response_type + '\'' +
                ", extraction_function='" + extraction_function + '\'' +
                '}';
    }



}