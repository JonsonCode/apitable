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
import com.apitable.databusclient.model.NodePermissionStateSO;
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
 * NodeSO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-09-08T12:26:03.751525+08:00[Asia/Shanghai]")
public class NodeSO {
  public static final String SERIALIZED_NAME_ACTIVE_VIEW = "activeView";
  @SerializedName(SERIALIZED_NAME_ACTIVE_VIEW)
  private String activeView;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_EXTRA = "extra";
  @SerializedName(SERIALIZED_NAME_EXTRA)
  private Object extra = null;

  public static final String SERIALIZED_NAME_ICON = "icon";
  @SerializedName(SERIALIZED_NAME_ICON)
  private String icon;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_IS_GHOST_NODE = "isGhostNode";
  @SerializedName(SERIALIZED_NAME_IS_GHOST_NODE)
  private Boolean isGhostNode;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_NODE_FAVORITE = "nodeFavorite";
  @SerializedName(SERIALIZED_NAME_NODE_FAVORITE)
  private Boolean nodeFavorite;

  public static final String SERIALIZED_NAME_NODE_PERMIT_SET = "nodePermitSet";
  @SerializedName(SERIALIZED_NAME_NODE_PERMIT_SET)
  private Boolean nodePermitSet;

  public static final String SERIALIZED_NAME_NODE_SHARED = "nodeShared";
  @SerializedName(SERIALIZED_NAME_NODE_SHARED)
  private Boolean nodeShared;

  public static final String SERIALIZED_NAME_PARENT_ID = "parentId";
  @SerializedName(SERIALIZED_NAME_PARENT_ID)
  private String parentId;

  public static final String SERIALIZED_NAME_PERMISSIONS = "permissions";
  @SerializedName(SERIALIZED_NAME_PERMISSIONS)
  private NodePermissionStateSO permissions;

  public static final String SERIALIZED_NAME_REVISION = "revision";
  @SerializedName(SERIALIZED_NAME_REVISION)
  private Integer revision;

  public static final String SERIALIZED_NAME_ROLE = "role";
  @SerializedName(SERIALIZED_NAME_ROLE)
  private String role;

  public static final String SERIALIZED_NAME_SPACE_ID = "spaceId";
  @SerializedName(SERIALIZED_NAME_SPACE_ID)
  private String spaceId;

  public NodeSO() {
  }

  public NodeSO activeView(String activeView) {
    
    this.activeView = activeView;
    return this;
  }

   /**
   * Get activeView
   * @return activeView
  **/
  @javax.annotation.Nullable
  public String getActiveView() {
    return activeView;
  }


  public void setActiveView(String activeView) {
    this.activeView = activeView;
  }


  public NodeSO description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nonnull
  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public NodeSO extra(Object extra) {
    
    this.extra = extra;
    return this;
  }

   /**
   * Get extra
   * @return extra
  **/
  @javax.annotation.Nullable
  public Object getExtra() {
    return extra;
  }


  public void setExtra(Object extra) {
    this.extra = extra;
  }


  public NodeSO icon(String icon) {
    
    this.icon = icon;
    return this;
  }

   /**
   * Get icon
   * @return icon
  **/
  @javax.annotation.Nonnull
  public String getIcon() {
    return icon;
  }


  public void setIcon(String icon) {
    this.icon = icon;
  }


  public NodeSO id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nonnull
  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public NodeSO isGhostNode(Boolean isGhostNode) {
    
    this.isGhostNode = isGhostNode;
    return this;
  }

   /**
   * Get isGhostNode
   * @return isGhostNode
  **/
  @javax.annotation.Nullable
  public Boolean getIsGhostNode() {
    return isGhostNode;
  }


  public void setIsGhostNode(Boolean isGhostNode) {
    this.isGhostNode = isGhostNode;
  }


  public NodeSO name(String name) {
    
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


  public NodeSO nodeFavorite(Boolean nodeFavorite) {
    
    this.nodeFavorite = nodeFavorite;
    return this;
  }

   /**
   * Get nodeFavorite
   * @return nodeFavorite
  **/
  @javax.annotation.Nonnull
  public Boolean getNodeFavorite() {
    return nodeFavorite;
  }


  public void setNodeFavorite(Boolean nodeFavorite) {
    this.nodeFavorite = nodeFavorite;
  }


  public NodeSO nodePermitSet(Boolean nodePermitSet) {
    
    this.nodePermitSet = nodePermitSet;
    return this;
  }

   /**
   * Get nodePermitSet
   * @return nodePermitSet
  **/
  @javax.annotation.Nonnull
  public Boolean getNodePermitSet() {
    return nodePermitSet;
  }


  public void setNodePermitSet(Boolean nodePermitSet) {
    this.nodePermitSet = nodePermitSet;
  }


  public NodeSO nodeShared(Boolean nodeShared) {
    
    this.nodeShared = nodeShared;
    return this;
  }

   /**
   * Get nodeShared
   * @return nodeShared
  **/
  @javax.annotation.Nonnull
  public Boolean getNodeShared() {
    return nodeShared;
  }


  public void setNodeShared(Boolean nodeShared) {
    this.nodeShared = nodeShared;
  }


  public NodeSO parentId(String parentId) {
    
    this.parentId = parentId;
    return this;
  }

   /**
   * Get parentId
   * @return parentId
  **/
  @javax.annotation.Nonnull
  public String getParentId() {
    return parentId;
  }


  public void setParentId(String parentId) {
    this.parentId = parentId;
  }


  public NodeSO permissions(NodePermissionStateSO permissions) {
    
    this.permissions = permissions;
    return this;
  }

   /**
   * Get permissions
   * @return permissions
  **/
  @javax.annotation.Nonnull
  public NodePermissionStateSO getPermissions() {
    return permissions;
  }


  public void setPermissions(NodePermissionStateSO permissions) {
    this.permissions = permissions;
  }


  public NodeSO revision(Integer revision) {
    
    this.revision = revision;
    return this;
  }

   /**
   * Get revision
   * minimum: 0
   * @return revision
  **/
  @javax.annotation.Nonnull
  public Integer getRevision() {
    return revision;
  }


  public void setRevision(Integer revision) {
    this.revision = revision;
  }


  public NodeSO role(String role) {
    
    this.role = role;
    return this;
  }

   /**
   * Get role
   * @return role
  **/
  @javax.annotation.Nonnull
  public String getRole() {
    return role;
  }


  public void setRole(String role) {
    this.role = role;
  }


  public NodeSO spaceId(String spaceId) {
    
    this.spaceId = spaceId;
    return this;
  }

   /**
   * Get spaceId
   * @return spaceId
  **/
  @javax.annotation.Nonnull
  public String getSpaceId() {
    return spaceId;
  }


  public void setSpaceId(String spaceId) {
    this.spaceId = spaceId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NodeSO nodeSO = (NodeSO) o;
    return Objects.equals(this.activeView, nodeSO.activeView) &&
        Objects.equals(this.description, nodeSO.description) &&
        Objects.equals(this.extra, nodeSO.extra) &&
        Objects.equals(this.icon, nodeSO.icon) &&
        Objects.equals(this.id, nodeSO.id) &&
        Objects.equals(this.isGhostNode, nodeSO.isGhostNode) &&
        Objects.equals(this.name, nodeSO.name) &&
        Objects.equals(this.nodeFavorite, nodeSO.nodeFavorite) &&
        Objects.equals(this.nodePermitSet, nodeSO.nodePermitSet) &&
        Objects.equals(this.nodeShared, nodeSO.nodeShared) &&
        Objects.equals(this.parentId, nodeSO.parentId) &&
        Objects.equals(this.permissions, nodeSO.permissions) &&
        Objects.equals(this.revision, nodeSO.revision) &&
        Objects.equals(this.role, nodeSO.role) &&
        Objects.equals(this.spaceId, nodeSO.spaceId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(activeView, description, extra, icon, id, isGhostNode, name, nodeFavorite, nodePermitSet, nodeShared, parentId, permissions, revision, role, spaceId);
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
    sb.append("class NodeSO {\n");
    sb.append("    activeView: ").append(toIndentedString(activeView)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    extra: ").append(toIndentedString(extra)).append("\n");
    sb.append("    icon: ").append(toIndentedString(icon)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isGhostNode: ").append(toIndentedString(isGhostNode)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    nodeFavorite: ").append(toIndentedString(nodeFavorite)).append("\n");
    sb.append("    nodePermitSet: ").append(toIndentedString(nodePermitSet)).append("\n");
    sb.append("    nodeShared: ").append(toIndentedString(nodeShared)).append("\n");
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
    sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
    sb.append("    revision: ").append(toIndentedString(revision)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    spaceId: ").append(toIndentedString(spaceId)).append("\n");
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
    openapiFields.add("activeView");
    openapiFields.add("description");
    openapiFields.add("extra");
    openapiFields.add("icon");
    openapiFields.add("id");
    openapiFields.add("isGhostNode");
    openapiFields.add("name");
    openapiFields.add("nodeFavorite");
    openapiFields.add("nodePermitSet");
    openapiFields.add("nodeShared");
    openapiFields.add("parentId");
    openapiFields.add("permissions");
    openapiFields.add("revision");
    openapiFields.add("role");
    openapiFields.add("spaceId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("description");
    openapiRequiredFields.add("icon");
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("nodeFavorite");
    openapiRequiredFields.add("nodePermitSet");
    openapiRequiredFields.add("nodeShared");
    openapiRequiredFields.add("parentId");
    openapiRequiredFields.add("permissions");
    openapiRequiredFields.add("revision");
    openapiRequiredFields.add("role");
    openapiRequiredFields.add("spaceId");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to NodeSO
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!NodeSO.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in NodeSO is not found in the empty JSON string", NodeSO.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!NodeSO.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `NodeSO` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : NodeSO.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("activeView") != null && !jsonObj.get("activeView").isJsonNull()) && !jsonObj.get("activeView").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `activeView` to be a primitive type in the JSON string but got `%s`", jsonObj.get("activeView").toString()));
      }
      if (!jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if (!jsonObj.get("icon").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `icon` to be a primitive type in the JSON string but got `%s`", jsonObj.get("icon").toString()));
      }
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (!jsonObj.get("parentId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `parentId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("parentId").toString()));
      }
      // validate the required field `permissions`
      NodePermissionStateSO.validateJsonElement(jsonObj.get("permissions"));
      if (!jsonObj.get("role").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `role` to be a primitive type in the JSON string but got `%s`", jsonObj.get("role").toString()));
      }
      if (!jsonObj.get("spaceId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `spaceId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("spaceId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!NodeSO.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'NodeSO' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<NodeSO> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(NodeSO.class));

       return (TypeAdapter<T>) new TypeAdapter<NodeSO>() {
           @Override
           public void write(JsonWriter out, NodeSO value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public NodeSO read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of NodeSO given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of NodeSO
  * @throws IOException if the JSON string is invalid with respect to NodeSO
  */
  public static NodeSO fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, NodeSO.class);
  }

 /**
  * Convert an instance of NodeSO to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

