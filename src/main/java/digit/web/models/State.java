package digit.web.models;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import digit.web.models.Action;
import digit.web.models.AuditDetails;
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
public class State   {
    @JsonProperty("actions")
    @Valid
    private List<Action> actions = null;

    @JsonProperty("applicationStatus")

    @Size(max=256)         private String applicationStatus = null;

    @JsonProperty("auditDetails")

    @Valid
    private AuditDetails auditDetails = null;

    @JsonProperty("businessServiceId")

    @Size(max=256)         private String businessServiceId = null;

    @JsonProperty("docUploadRequired")

    private Boolean docUploadRequired = null;

    @JsonProperty("isStartState")

    private Boolean isStartState = null;

    @JsonProperty("isStateUpdatable")

    private Boolean isStateUpdatable = null;

    @JsonProperty("isTerminateState")

    private Boolean isTerminateState = null;

    @JsonProperty("sla")

    private Long sla = null;

    @JsonProperty("state")

    @Size(max=256)         private String state = null;

    @JsonProperty("tenantId")

    @Size(max=256)         private String tenantId = null;

    @JsonProperty("uuid")

    @Size(max=256)         private String uuid = null;


    public State addActionsItem(Action actionsItem) {
        if (this.actions == null) {
            this.actions = new ArrayList<>();
        }
        this.actions.add(actionsItem);
        return this;
    }
    /**
     * Get actions
     * @return actions
     **/
    @ApiModelProperty(value = "")
    @Valid
    public List<Action> getActions() {
        return actions;
    }

    /**
     * Get applicationStatus
     * @return applicationStatus
     **/
    @ApiModelProperty(value = "")

    @Size(max=256)   public String getApplicationStatus() {
        return applicationStatus;
    }

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
     * Get businessServiceId
     * @return businessServiceId
     **/
    @ApiModelProperty(value = "")

    @Size(max=256)   public String getBusinessServiceId() {
        return businessServiceId;
    }

    /**
     * Get docUploadRequired
     * @return docUploadRequired
     **/
    @ApiModelProperty(value = "")

    public Boolean isisDocUploadRequired() {
        return docUploadRequired;
    }

    /**
     * Get isStartState
     * @return isStartState
     **/
    @ApiModelProperty(value = "")

    public Boolean isisIsStartState() {
        return isStartState;
    }

    /**
     * Get isStateUpdatable
     * @return isStateUpdatable
     **/
    @ApiModelProperty(value = "")

    public Boolean isisIsStateUpdatable() {
        return isStateUpdatable;
    }

    /**
     * Get isTerminateState
     * @return isTerminateState
     **/
    @ApiModelProperty(value = "")

    public Boolean isisIsTerminateState() {
        return isTerminateState;
    }

    /**
     * Get sla
     * @return sla
     **/
    @ApiModelProperty(value = "")

    public Long getSla() {
        return sla;
    }

    /**
     * Get state
     * @return state
     **/
    @ApiModelProperty(value = "")

    @Size(max=256)   public String getState() {
        return state;
    }

    /**
     * Get tenantId
     * @return tenantId
     **/
    @ApiModelProperty(value = "")

    @Size(max=256)   public String getTenantId() {
        return tenantId;
    }

    /**
     * Get uuid
     * @return uuid
     **/
    @ApiModelProperty(value = "")

    @Size(max=256)   public String getUuid() {
        return uuid;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        State state = (State) o;
        return Objects.equals(this.actions, state.actions) &&
                Objects.equals(this.applicationStatus, state.applicationStatus) &&
                Objects.equals(this.auditDetails, state.auditDetails) &&
                Objects.equals(this.businessServiceId, state.businessServiceId) &&
                Objects.equals(this.docUploadRequired, state.docUploadRequired) &&
                Objects.equals(this.isStartState, state.isStartState) &&
                Objects.equals(this.isStateUpdatable, state.isStateUpdatable) &&
                Objects.equals(this.isTerminateState, state.isTerminateState) &&
                Objects.equals(this.sla, state.sla) &&
                Objects.equals(this.state, state.state) &&
                Objects.equals(this.tenantId, state.tenantId) &&
                Objects.equals(this.uuid, state.uuid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(actions, applicationStatus, auditDetails, businessServiceId, docUploadRequired, isStartState, isStateUpdatable, isTerminateState, sla, state, tenantId, uuid);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class State {\n");

        sb.append("    actions: ").append(toIndentedString(actions)).append("\n");
        sb.append("    applicationStatus: ").append(toIndentedString(applicationStatus)).append("\n");
        sb.append("    auditDetails: ").append(toIndentedString(auditDetails)).append("\n");
        sb.append("    businessServiceId: ").append(toIndentedString(businessServiceId)).append("\n");
        sb.append("    docUploadRequired: ").append(toIndentedString(docUploadRequired)).append("\n");
        sb.append("    isStartState: ").append(toIndentedString(isStartState)).append("\n");
        sb.append("    isStateUpdatable: ").append(toIndentedString(isStateUpdatable)).append("\n");
        sb.append("    isTerminateState: ").append(toIndentedString(isTerminateState)).append("\n");
        sb.append("    sla: ").append(toIndentedString(sla)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
        sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
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