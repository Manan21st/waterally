package digit.web.models;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import digit.web.models.Role;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;

import lombok.Setter;
import org.springframework.validation.annotation.Validated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;

/**
 * User
 */
@Setter
@Validated
public class User   {
    @JsonProperty("emailId")

    @Size(max=300)         private String emailId = null;

    @JsonProperty("id")

    private Long id = null;

    @JsonProperty("mobileNumber")

    @Size(max=150)         private String mobileNumber = null;

    @JsonProperty("name")

    @Size(max=250)         private String name = null;

    @JsonProperty("roles")
    @Valid
    private List<Role> roles = null;

    @JsonProperty("tenantId")

    @Size(max=256)         private String tenantId = null;

    @JsonProperty("type")

    @Size(max=50)         private String type = null;

    @JsonProperty("userName")

    @Size(max=180)         private String userName = null;

    @JsonProperty("uuid")

    @Size(max=36)         private String uuid = null;

    /**
     * Get emailId
     * @return emailId
     **/
    @ApiModelProperty(value = "")

    @Size(max=300)   public String getEmailId() {
        return emailId;
    }

    /**
     * Get id
     * @return id
     **/
    @ApiModelProperty(value = "")

    public Long getId() {
        return id;
    }

    /**
     * Get mobileNumber
     * @return mobileNumber
     **/
    @ApiModelProperty(value = "")

    @Size(max=150)   public String getMobileNumber() {
        return mobileNumber;
    }

    /**
     * Get name
     * @return name
     **/
    @ApiModelProperty(value = "")

    @Size(max=250)   public String getName() {
        return name;
    }

    public User addRolesItem(Role rolesItem) {
        if (this.roles == null) {
            this.roles = new ArrayList<>();
        }
        this.roles.add(rolesItem);
        return this;
    }
    /**
     * Get roles
     * @return roles
     **/
    @ApiModelProperty(value = "")
    @Valid
    public List<Role> getRoles() {
        return roles;
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
     * Get type
     * @return type
     **/
    @ApiModelProperty(value = "")

    @Size(max=50)   public String getType() {
        return type;
    }

    /**
     * Get userName
     * @return userName
     **/
    @ApiModelProperty(value = "")

    @Size(max=180)   public String getUserName() {
        return userName;
    }

    /**
     * Get uuid
     * @return uuid
     **/
    @ApiModelProperty(value = "")

    @Size(max=36)   public String getUuid() {
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
        User user = (User) o;
        return Objects.equals(this.emailId, user.emailId) &&
                Objects.equals(this.id, user.id) &&
                Objects.equals(this.mobileNumber, user.mobileNumber) &&
                Objects.equals(this.name, user.name) &&
                Objects.equals(this.roles, user.roles) &&
                Objects.equals(this.tenantId, user.tenantId) &&
                Objects.equals(this.type, user.type) &&
                Objects.equals(this.userName, user.userName) &&
                Objects.equals(this.uuid, user.uuid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(emailId, id, mobileNumber, name, roles, tenantId, type, userName, uuid);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class User {\n");

        sb.append("    emailId: ").append(toIndentedString(emailId)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    mobileNumber: ").append(toIndentedString(mobileNumber)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    roles: ").append(toIndentedString(roles)).append("\n");
        sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
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