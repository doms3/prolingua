package prolingua;

import javax.json.JsonObject;

public class JsonConverter {

	public static JsonConverter singleton;
	
	private JsonConverter(JsonObject j) {
		
	}
	
	public static JsonConverter getInstance() {
		if (JsonConverter.singleton == null){
			return new JsonConverter()
		}
	}
	
}
