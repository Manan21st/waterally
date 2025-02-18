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
 * Role
 */
@Setter
@Validated
public class Role   {
    @JsonProperty("code")

    @Size(max=50)         private String code = null;

    @JsonProperty("id")

    private Long id = null;

    @JsonProperty("name")

    @Size(max=128)         private String name = null;

    @JsonProperty("tenantId")

    @Size(max=256)         private String tenantId = null;

    /**
     * Get code
     * @return code
     **/
    @ApiModelProperty(value = "")

    @Size(max=50)   public String getCode() {
        return code;
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
     * Get name
     * @return name
     **/
    @ApiModelProperty(value = "")

    @Size(max=128)   public String getName() {
        return name;
    }

    /**
     * Get tenantId
     * @return tenantId
     **/
    @ApiModelProperty(value = "")

    @Size(max=256)   public String getTenantId() {
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
        Role role = (Role) o;
        return Objects.equals(this.code, role.code) &&
                Objects.equals(this.id, role.id) &&
                Objects.equals(this.name, role.name) &&
                Objects.equals(this.tenantId, role.tenantId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, id, name, tenantId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Role {\n");

        sb.append("    code: ").append(toIndentedString(code)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
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