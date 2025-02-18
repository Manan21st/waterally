package digit.web.models;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import digit.web.models.Document;
import digit.web.models.State;
import digit.web.models.User;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;

import lombok.Setter;
import org.springframework.validation.annotation.Validated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;

/**
 * A Object holds the basic data for a Trade License
 */
@Setter
@Schema(description = "A Object holds the basic data for a Trade License")
@Validated
public class ProcessInstance   {
    @JsonProperty("action")
    @NotNull

    @Size(max=128)         private String action = null;

    @JsonProperty("assignes")
    @Valid
    private List<User> assignes = null;

    @JsonProperty("businessId")
    @NotNull

    @Size(max=128)         private String businessId = null;

    @JsonProperty("businessService")
    @NotNull

    @Size(max=128)         private String businessService = null;

    @JsonProperty("comment")

    private String comment = null;

    @JsonProperty("documents")
    @Valid
    private List<Document> documents = null;

    @JsonProperty("id")

    @Size(max=64)         private String id = null;

    @JsonProperty("moduleName")
    @NotNull

    @Size(max=64)         private String moduleName = null;

    @JsonProperty("state")

    @Valid
    private State state = null;

    @JsonProperty("tenantId")
    @NotNull

    @Size(max=128)         private String tenantId = null;

    /**
     * Get action
     * @return action
     **/
    @ApiModelProperty(required = true, value = "")
    @NotNull

    @Size(max=128)   public String getAction() {
        return action;
    }

    public ProcessInstance addAssignesItem(User assignesItem) {
        if (this.assignes == null) {
            this.assignes = new ArrayList<>();
        }
        this.assignes.add(assignesItem);
        return this;
    }
    /**
     * Get assignes
     * @return assignes
     **/
    @ApiModelProperty(value = "")
    @Valid
    public List<User> getAssignes() {
        return assignes;
    }

    /**
     * Get businessId
     * @return businessId
     **/
    @ApiModelProperty(required = true, value = "")
    @NotNull

    @Size(max=128)   public String getBusinessId() {
        return businessId;
    }

    /**
     * Get businessService
     * @return businessService
     **/
    @ApiModelProperty(required = true, value = "")
    @NotNull

    @Size(max=128)   public String getBusinessService() {
        return businessService;
    }

    /**
     * Get comment
     * @return comment
     **/
    @ApiModelProperty(value = "")

    public String getComment() {
        return comment;
    }

    public ProcessInstance addDocumentsItem(Document documentsItem) {
        if (this.documents == null) {
            this.documents = new ArrayList<>();
        }
        this.documents.add(documentsItem);
        return this;
    }
    /**
     * Get documents
     * @return documents
     **/
    @ApiModelProperty(value = "")
    @Valid
    public List<Document> getDocuments() {
        return documents;
    }

    /**
     * Get id
     * @return id
     **/
    @ApiModelProperty(value = "")

    @Size(max=64)   public String getId() {
        return id;
    }

    /**
     * Get moduleName
     * @return moduleName
     **/
    @ApiModelProperty(required = true, value = "")
    @NotNull

    @Size(max=64)   public String getModuleName() {
        return moduleName;
    }

    /**
     * Get state
     * @return state
     **/
    @ApiModelProperty(value = "")

    @Valid
    public State getState() {
        return state;
    }

    /**
     * Get tenantId
     * @return tenantId
     **/
    @ApiModelProperty(required = true, value = "")
    @NotNull

    @Size(max=128)   public String getTenantId() {
        return tenantId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ProcessInstance processInstance = (ProcessInstance) o;
        return Objects.equals(this.action, processInstance.action) &&
                Objects.equals(this.assignes, processInstance.assignes) &&
                Objects.equals(this.businessId, processInstance.businessId) &&
                Objects.equals(this.businessService, processInstance.businessService) &&
                Objects.equals(this.comment, processInstance.comment) &&
                Objects.equals(this.documents, processInstance.documents) &&
                Objects.equals(this.id, processInstance.id) &&
                Objects.equals(this.moduleName, processInstance.moduleName) &&
                Objects.equals(this.state, processInstance.state) &&
                Objects.equals(this.tenantId, processInstance.tenantId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(action, assignes, businessId, businessService, comment, documents, id, moduleName, state, tenantId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProcessInstance {\n");

        sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    assignes: ").append(toIndentedString(assignes)).append("\n");
        sb.append("    businessId: ").append(toIndentedString(businessId)).append("\n");
        sb.append("    businessService: ").append(toIndentedString(businessService)).append("\n");
        sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
        sb.append("    documents: ").append(toIndentedString(documents)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    moduleName: ").append(toIndentedString(moduleName)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
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