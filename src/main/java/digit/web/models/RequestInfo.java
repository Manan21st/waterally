package digit.web.models;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import digit.web.models.PlainAccessRequest;
import digit.web.models.User;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Setter;
import org.springframework.validation.annotation.Validated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;

/**
 * RequestInfo
 */
@Setter
@Validated
public class RequestInfo   {
    @JsonProperty("action")

    private String action = null;

    @JsonProperty("apiId")

    private String apiId = null;

    @JsonProperty("authToken")

    private String authToken = null;

    @JsonProperty("correlationId")

    private String correlationId = null;

    @JsonProperty("did")

    private String did = null;

    @JsonProperty("key")

    private String key = null;

    @JsonProperty("msgId")

    private String msgId = null;

    @JsonProperty("plainAccessRequest")

    @Valid
    private PlainAccessRequest plainAccessRequest = null;

    @JsonProperty("ts")

    private Long ts = null;

    @JsonProperty("userInfo")

    @Valid
    private User userInfo = null;

    @JsonProperty("ver")

    private String ver = null;

    /**
     * Get action
     * @return action
     **/
    @ApiModelProperty(value = "")

    public String getAction() {
        return action;
    }

    /**
     * Get apiId
     * @return apiId
     **/
    @ApiModelProperty(value = "")

    public String getApiId() {
        return apiId;
    }

    /**
     * Get authToken
     * @return authToken
     **/
    @ApiModelProperty(value = "")

    public String getAuthToken() {
        return authToken;
    }

    /**
     * Get correlationId
     * @return correlationId
     **/
    @ApiModelProperty(value = "")

    public String getCorrelationId() {
        return correlationId;
    }

    /**
     * Get did
     * @return did
     **/
    @ApiModelProperty(value = "")

    public String getDid() {
        return did;
    }

    /**
     * Get key
     * @return key
     **/
    @ApiModelProperty(value = "")

    public String getKey() {
        return key;
    }

    /**
     * Get msgId
     * @return msgId
     **/
    @ApiModelProperty(value = "")

    public String getMsgId() {
        return msgId;
    }

    /**
     * Get plainAccessRequest
     * @return plainAccessRequest
     **/
    @ApiModelProperty(value = "")

    @Valid
    public PlainAccessRequest getPlainAccessRequest() {
        return plainAccessRequest;
    }

    /**
     * Get ts
     * @return ts
     **/
    @ApiModelProperty(value = "")

    public Long getTs() {
        return ts;
    }

    /**
     * Get userInfo
     * @return userInfo
     **/
    @ApiModelProperty(value = "")

    @Valid
    public User getUserInfo() {
        return userInfo;
    }

    /**
     * Get ver
     * @return ver
     **/
    @ApiModelProperty(value = "")

    public String getVer() {
        return ver;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RequestInfo requestInfo = (RequestInfo) o;
        return Objects.equals(this.action, requestInfo.action) &&
                Objects.equals(this.apiId, requestInfo.apiId) &&
                Objects.equals(this.authToken, requestInfo.authToken) &&
                Objects.equals(this.correlationId, requestInfo.correlationId) &&
                Objects.equals(this.did, requestInfo.did) &&
                Objects.equals(this.key, requestInfo.key) &&
                Objects.equals(this.msgId, requestInfo.msgId) &&
                Objects.equals(this.plainAccessRequest, requestInfo.plainAccessRequest) &&
                Objects.equals(this.ts, requestInfo.ts) &&
                Objects.equals(this.userInfo, requestInfo.userInfo) &&
                Objects.equals(this.ver, requestInfo.ver);
    }

    @Override
    public int hashCode() {
        return Objects.hash(action, apiId, authToken, correlationId, did, key, msgId, plainAccessRequest, ts, userInfo, ver);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RequestInfo {\n");

        sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    apiId: ").append(toIndentedString(apiId)).append("\n");
        sb.append("    authToken: ").append(toIndentedString(authToken)).append("\n");
        sb.append("    correlationId: ").append(toIndentedString(correlationId)).append("\n");
        sb.append("    did: ").append(toIndentedString(did)).append("\n");
        sb.append("    key: ").append(toIndentedString(key)).append("\n");
        sb.append("    msgId: ").append(toIndentedString(msgId)).append("\n");
        sb.append("    plainAccessRequest: ").append(toIndentedString(plainAccessRequest)).append("\n");
        sb.append("    ts: ").append(toIndentedString(ts)).append("\n");
        sb.append("    userInfo: ").append(toIndentedString(userInfo)).append("\n");
        sb.append("    ver: ").append(toIndentedString(ver)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
}