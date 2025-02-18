package digit.web.models;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import digit.web.models.AuditDetails;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Setter;
import org.springframework.validation.annotation.Validated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;

/**
 * RoadCuttingInfo
 */
@Setter
@Validated
public class RoadCuttingInfo   {
    @JsonProperty("auditDetails")

    @Valid
    private AuditDetails auditDetails = null;

    @JsonProperty("id")

    private String id = null;

    @JsonProperty("roadCuttingArea")

    private Float roadCuttingArea = null;

    @JsonProperty("roadType")

    private String roadType = null;

    /**
     * Gets or Sets status
     */
    public enum StatusEnum {
        ACTIVE("ACTIVE"),

        INACTIVE("INACTIVE"),

        INWORKFLOW("INWORKFLOW");

        private String value;

        StatusEnum(String value) {
            this.value = value;
        }

        @Override
        @JsonValue
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static StatusEnum fromValue(String text) {
            for (StatusEnum b : StatusEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }
    }        @JsonProperty("status")

    private StatusEnum status = null;

    /**
     * Get auditDetails
     * @return auditDetails
     **/
    @ApiModelProperty(value = "")

    @Valid
    public AuditDetails getAuditDetails() {
        return auditDetails;
    }

    /**
     * Get id
     * @return id
     **/
    @ApiModelProperty(value = "")

    public String getId() {
        return id;
    }

    /**
     * Get roadCuttingArea
     * @return roadCuttingArea
     **/
    @ApiModelProperty(value = "")

    public Float getRoadCuttingArea() {
        return roadCuttingArea;
    }

    /**
     * Get roadType
     * @return roadType
     **/
    @ApiModelProperty(value = "")

    public String getRoadType() {
        return roadType;
    }

    /**
     * Get status
     * @return status
     **/
    @ApiModelProperty(value = "")

    public StatusEnum getStatus() {
        return status;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RoadCuttingInfo roadCuttingInfo = (RoadCuttingInfo) o;
        return Objects.equals(this.auditDetails, roadCuttingInfo.auditDetails) &&
                Objects.equals(this.id, roadCuttingInfo.id) &&
                Objects.equals(this.roadCuttingArea, roadCuttingInfo.roadCuttingArea) &&
                Objects.equals(this.roadType, roadCuttingInfo.roadType) &&
                Objects.equals(this.status, roadCuttingInfo.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(auditDetails, id, roadCuttingArea, roadType, status);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RoadCuttingInfo {\n");

        sb.append("    auditDetails: ").append(toIndentedString(auditDetails)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    roadCuttingArea: ").append(toIndentedString(roadCuttingArea)).append("\n");
        sb.append("    roadType: ").append(toIndentedString(roadType)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
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