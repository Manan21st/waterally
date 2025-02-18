package digit.web.models;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Setter;
import org.springframework.validation.annotation.Validated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;

/**
 * ResponseInfo
 */
@Setter
@Validated
public class ResponseInfo   {
    @JsonProperty("apiId")

    private String apiId = null;

    @JsonProperty("msgId")

    private String msgId = null;

    @JsonProperty("resMsgId")

    private String resMsgId = null;

    @JsonProperty("status")

    private String status = null;

    @JsonProperty("ts")

    private Long ts = null;

    @JsonProperty("ver")

    private String ver = null;

    /**
     * Get apiId
     * @return apiId
     **/
    @ApiModelProperty(value = "")

    public String getApiId() {
        return apiId;
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
     * Get resMsgId
     * @return resMsgId
     **/
    @ApiModelProperty(value = "")

    public String getResMsgId() {
        return resMsgId;
    }

    /**
     * Get status
     * @return status
     **/
    @ApiModelProperty(value = "")

    public String getStatus() {
        return status;
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
        ResponseInfo responseInfo = (ResponseInfo) o;
        return Objects.equals(this.apiId, responseInfo.apiId) &&
                Objects.equals(this.msgId, responseInfo.msgId) &&
                Objects.equals(this.resMsgId, responseInfo.resMsgId) &&
                Objects.equals(this.status, responseInfo.status) &&
                Objects.equals(this.ts, responseInfo.ts) &&
                Objects.equals(this.ver, responseInfo.ver);
    }

    @Override
    public int hashCode() {
        return Objects.hash(apiId, msgId, resMsgId, status, ts, ver);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResponseInfo {\n");

        sb.append("    apiId: ").append(toIndentedString(apiId)).append("\n");
        sb.append("    msgId: ").append(toIndentedString(msgId)).append("\n");
        sb.append("    resMsgId: ").append(toIndentedString(resMsgId)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    ts: ").append(toIndentedString(ts)).append("\n");
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