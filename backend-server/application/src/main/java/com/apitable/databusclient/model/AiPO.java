/*
 * databus-server
 * databus-server APIs
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.apitable.databusclient.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.apitable.databusclient.JSON;

/**
 * AiPO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AiPO {
  public static final String SERIALIZED_NAME_AI_ID = "aiId";
  @SerializedName(SERIALIZED_NAME_AI_ID)
  private String aiId;

  public static final String SERIALIZED_NAME_EMBEDDING_MODEL = "embeddingModel";
  @SerializedName(SERIALIZED_NAME_EMBEDDING_MODEL)
  private String embeddingModel;

  public static final String SERIALIZED_NAME_MODEL = "model";
  @SerializedName(SERIALIZED_NAME_MODEL)
  private String model;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_PROLOGUE = "prologue";
  @SerializedName(SERIALIZED_NAME_PROLOGUE)
  private String prologue;

  public static final String SERIALIZED_NAME_PROMPT = "prompt";
  @SerializedName(SERIALIZED_NAME_PROMPT)
  private String prompt;

  public static final String SERIALIZED_NAME_SETTING = "setting";
  @SerializedName(SERIALIZED_NAME_SETTING)
  private String setting;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public AiPO() {
  }

  public AiPO aiId(String aiId) {
    
    this.aiId = aiId;
    return this;
  }

   /**
   * Get aiId
   * @return aiId
  **/
  @javax.annotation.Nonnull
  public String getAiId() {
    return aiId;
  }


  public void setAiId(String aiId) {
    this.aiId = aiId;
  }


  public AiPO embeddingModel(String embeddingModel) {
    
    this.embeddingModel = embeddingModel;
    return this;
  }

   /**
   * Get embeddingModel
   * @return embeddingModel
  **/
  @javax.annotation.Nullable
  public String getEmbeddingModel() {
    return embeddingModel;
  }


  public void setEmbeddingModel(String embeddingModel) {
    this.embeddingModel = embeddingModel;
  }


  public AiPO model(String model) {
    
    this.model = model;
    return this;
  }

   /**
   * Get model
   * @return model
  **/
  @javax.annotation.Nullable
  public String getModel() {
    return model;
  }


  public void setModel(String model) {
    this.model = model;
  }


  public AiPO name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nonnull
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public AiPO prologue(String prologue) {
    
    this.prologue = prologue;
    return this;
  }

   /**
   * Get prologue
   * @return prologue
  **/
  @javax.annotation.Nullable
  public String getPrologue() {
    return prologue;
  }


  public void setPrologue(String prologue) {
    this.prologue = prologue;
  }


  public AiPO prompt(String prompt) {
    
    this.prompt = prompt;
    return this;
  }

   /**
   * Get prompt
   * @return prompt
  **/
  @javax.annotation.Nullable
  public String getPrompt() {
    return prompt;
  }


  public void setPrompt(String prompt) {
    this.prompt = prompt;
  }


  public AiPO setting(String setting) {
    
    this.setting = setting;
    return this;
  }

   /**
   * Get setting
   * @return setting
  **/
  @javax.annotation.Nullable
  public String getSetting() {
    return setting;
  }


  public void setSetting(String setting) {
    this.setting = setting;
  }


  public AiPO type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nonnull
  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AiPO aiPO = (AiPO) o;
    return Objects.equals(this.aiId, aiPO.aiId) &&
        Objects.equals(this.embeddingModel, aiPO.embeddingModel) &&
        Objects.equals(this.model, aiPO.model) &&
        Objects.equals(this.name, aiPO.name) &&
        Objects.equals(this.prologue, aiPO.prologue) &&
        Objects.equals(this.prompt, aiPO.prompt) &&
        Objects.equals(this.setting, aiPO.setting) &&
        Objects.equals(this.type, aiPO.type);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(aiId, embeddingModel, model, name, prologue, prompt, setting, type);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AiPO {\n");
    sb.append("    aiId: ").append(toIndentedString(aiId)).append("\n");
    sb.append("    embeddingModel: ").append(toIndentedString(embeddingModel)).append("\n");
    sb.append("    model: ").append(toIndentedString(model)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    prologue: ").append(toIndentedString(prologue)).append("\n");
    sb.append("    prompt: ").append(toIndentedString(prompt)).append("\n");
    sb.append("    setting: ").append(toIndentedString(setting)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("aiId");
    openapiFields.add("embeddingModel");
    openapiFields.add("model");
    openapiFields.add("name");
    openapiFields.add("prologue");
    openapiFields.add("prompt");
    openapiFields.add("setting");
    openapiFields.add("type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("aiId");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("type");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to AiPO
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AiPO.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AiPO is not found in the empty JSON string", AiPO.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AiPO.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AiPO` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : AiPO.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("aiId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `aiId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("aiId").toString()));
      }
      if ((jsonObj.get("embeddingModel") != null && !jsonObj.get("embeddingModel").isJsonNull()) && !jsonObj.get("embeddingModel").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `embeddingModel` to be a primitive type in the JSON string but got `%s`", jsonObj.get("embeddingModel").toString()));
      }
      if ((jsonObj.get("model") != null && !jsonObj.get("model").isJsonNull()) && !jsonObj.get("model").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `model` to be a primitive type in the JSON string but got `%s`", jsonObj.get("model").toString()));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("prologue") != null && !jsonObj.get("prologue").isJsonNull()) && !jsonObj.get("prologue").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `prologue` to be a primitive type in the JSON string but got `%s`", jsonObj.get("prologue").toString()));
      }
      if ((jsonObj.get("prompt") != null && !jsonObj.get("prompt").isJsonNull()) && !jsonObj.get("prompt").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `prompt` to be a primitive type in the JSON string but got `%s`", jsonObj.get("prompt").toString()));
      }
      if ((jsonObj.get("setting") != null && !jsonObj.get("setting").isJsonNull()) && !jsonObj.get("setting").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `setting` to be a primitive type in the JSON string but got `%s`", jsonObj.get("setting").toString()));
      }
      if (!jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AiPO.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AiPO' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AiPO> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AiPO.class));

       return (TypeAdapter<T>) new TypeAdapter<AiPO>() {
           @Override
           public void write(JsonWriter out, AiPO value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AiPO read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AiPO given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AiPO
  * @throws IOException if the JSON string is invalid with respect to AiPO
  */
  public static AiPO fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AiPO.class);
  }

 /**
  * Convert an instance of AiPO to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

