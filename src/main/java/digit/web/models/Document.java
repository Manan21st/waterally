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
 * Document
 */
@Setter
@Validated
public class Document   {
    @JsonProperty("auditDetails")

    @Valid
    private AuditDetails auditDetails = null;

    @JsonProperty("documentType")
    @NotNull

    private String documentType = null;

    @JsonProperty("documentUid")

    private String documentUid = null;

    @JsonProperty("fileStoreId")
    @NotNull

    private String fileStoreId = null;

    @JsonProperty("id")

    private String id = null;

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
     * Get documentType
     * @return documentType
     **/
    @ApiModelProperty(required = true, value = "")
    @NotNull

    public String getDocumentType() {
        return documentType;
    }

    /**
     * Get documentUid
     * @return documentUid
     **/
    @ApiModelProperty(value = "")

    public String getDocumentUid() {
        return documentUid;
    }

    /**
     * Get fileStoreId
     * @return fileStoreId
     **/
    @ApiModelProperty(required = true, value = "")
    @NotNull

    public String getFileStoreId() {
        return fileStoreId;
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
        Document document = (Document) o;
        return Objects.equals(this.auditDetails, document.auditDetails) &&
                Objects.equals(this.documentType, document.documentType) &&
                Objects.equals(this.documentUid, document.documentUid) &&
                Objects.equals(this.fileStoreId, document.fileStoreId) &&
                Objects.equals(this.id, document.id) &&
                Objects.equals(this.status, document.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(auditDetails, documentType, documentUid, fileStoreId, id, status);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Document {\n");

        sb.append("    auditDetails: ").append(toIndentedString(auditDetails)).append("\n");
        sb.append("    documentType: ").append(toIndentedString(documentType)).append("\n");
        sb.append("    documentUid: ").append(toIndentedString(documentUid)).append("\n");
        sb.append("    fileStoreId: ").append(toIndentedString(fileStoreId)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
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