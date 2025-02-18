package digit.web.models;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import digit.web.models.Document;
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
 * OwnerInfo
 */
@Setter
@Validated
public class OwnerInfo   {
    @JsonProperty("aadhaarNumber")

    @Pattern(regexp="^[0-9]{12}$")         private String aadhaarNumber = null;

    @JsonProperty("accountLocked")

    private Boolean accountLocked = null;

    @JsonProperty("active")

    private Boolean active = null;

    @JsonProperty("altContactNumber")

    @Size(max=50)         private String altContactNumber = null;

    @JsonProperty("bloodGroup")

    @Size(max=32)         private String bloodGroup = null;

    @JsonProperty("correspondenceAddress")

    private String correspondenceAddress = null;

    @JsonProperty("correspondenceCity")

    @Size(max=300)         private String correspondenceCity = null;

    @JsonProperty("correspondencePinCode")

    @Size(max=10)         private String correspondencePinCode = null;

    @JsonProperty("createdBy")

    @Size(max=64)         private String createdBy = null;

    @JsonProperty("createdDate")

    private Long createdDate = null;

    @JsonProperty("dob")

    private Long dob = null;

    @JsonProperty("documents")
    @Valid
    private List<Document> documents = null;

    @JsonProperty("emailId")

    @Size(max=128)         private String emailId = null;

    @JsonProperty("fatherOrHusbandName")

    private String fatherOrHusbandName = null;

    @JsonProperty("gender")

    private String gender = null;

    @JsonProperty("id")

    private Long id = null;

    @JsonProperty("identificationMark")

    @Size(max=300)         private String identificationMark = null;

    @JsonProperty("institutionId")

    private String institutionId = null;

    @JsonProperty("isPrimaryOwner")

    private Boolean isPrimaryOwner = null;

    @JsonProperty("lastModifiedBy")

    @Size(max=64)         private String lastModifiedBy = null;

    @JsonProperty("lastModifiedDate")

    private Long lastModifiedDate = null;

    @JsonProperty("locale")

    @Size(max=16)         private String locale = null;

    @JsonProperty("mobileNumber")
    @NotNull

    private String mobileNumber = null;

    @JsonProperty("name")
    @NotNull

    @Pattern(regexp="^[a-zA-Z0-9 \\-'`\\.]*$") @Size(max=100)         private String name = null;

    @JsonProperty("ownerInfoUuid")

    private String ownerInfoUuid = null;

    @JsonProperty("ownerShipPercentage")

    private Double ownerShipPercentage = null;

    @JsonProperty("ownerType")
    @NotNull

    private String ownerType = null;

    @JsonProperty("pan")

    @Size(max=10)         private String pan = null;

    @JsonProperty("password")

    @Size(max=64)         private String password = null;

    @JsonProperty("permanentAddress")

    @Size(max=300)         private String permanentAddress = null;

    @JsonProperty("permanentCity")

    @Size(max=300)         private String permanentCity = null;

    @JsonProperty("permanentPinCode")

    @Size(max=10)         private String permanentPinCode = null;

    @JsonProperty("photo")

    @Size(max=36)         private String photo = null;

    @JsonProperty("pwdExpiryDate")

    private Long pwdExpiryDate = null;

    @JsonProperty("relationship")

    private String relationship = null;

    @JsonProperty("roles")
    @Valid
    private List<Role> roles = null;

    @JsonProperty("salutation")

    private String salutation = null;

    @JsonProperty("signature")

    @Size(max=36)         private String signature = null;

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

    @JsonProperty("tenantId")

    @Size(max=256)         private String tenantId = null;

    @JsonProperty("type")

    @Size(max=50)         private String type = null;

    @JsonProperty("userName")

    @Size(max=64)         private String userName = null;

    @JsonProperty("uuid")

    @Size(max=64)         private String uuid = null;

    /**
     * Get aadhaarNumber
     * @return aadhaarNumber
     **/
    @ApiModelProperty(value = "")

    @Pattern(regexp="^[0-9]{12}$")   public String getAadhaarNumber() {
        return aadhaarNumber;
    }

    /**
     * Get accountLocked
     * @return accountLocked
     **/
    @ApiModelProperty(value = "")

    public Boolean isisAccountLocked() {
        return accountLocked;
    }

    /**
     * Get active
     * @return active
     **/
    @ApiModelProperty(value = "")

    public Boolean isisActive() {
        return active;
    }

    /**
     * Get altContactNumber
     * @return altContactNumber
     **/
    @ApiModelProperty(value = "")

    @Size(max=50)   public String getAltContactNumber() {
        return altContactNumber;
    }

    /**
     * Get bloodGroup
     * @return bloodGroup
     **/
    @ApiModelProperty(value = "")

    @Size(max=32)   public String getBloodGroup() {
        return bloodGroup;
    }

    /**
     * Get correspondenceAddress
     * @return correspondenceAddress
     **/
    @ApiModelProperty(value = "")

    public String getCorrespondenceAddress() {
        return correspondenceAddress;
    }

    /**
     * Get correspondenceCity
     * @return correspondenceCity
     **/
    @ApiModelProperty(value = "")

    @Size(max=300)   public String getCorrespondenceCity() {
        return correspondenceCity;
    }

    /**
     * Get correspondencePinCode
     * @return correspondencePinCode
     **/
    @ApiModelProperty(value = "")

    @Size(max=10)   public String getCorrespondencePinCode() {
        return correspondencePinCode;
    }

    /**
     * Get createdBy
     * @return createdBy
     **/
    @ApiModelProperty(value = "")

    @Size(max=64)   public String getCreatedBy() {
        return createdBy;
    }

    /**
     * Get createdDate
     * @return createdDate
     **/
    @ApiModelProperty(value = "")

    public Long getCreatedDate() {
        return createdDate;
    }

    /**
     * Get dob
     * @return dob
     **/
    @ApiModelProperty(value = "")

    public Long getDob() {
        return dob;
    }

    public OwnerInfo addDocumentsItem(Document documentsItem) {
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
     * Get emailId
     * @return emailId
     **/
    @ApiModelProperty(value = "")

    @Size(max=128)   public String getEmailId() {
        return emailId;
    }

    /**
     * Get fatherOrHusbandName
     * @return fatherOrHusbandName
     **/
    @ApiModelProperty(value = "")

    public String getFatherOrHusbandName() {
        return fatherOrHusbandName;
    }

    /**
     * Get gender
     * @return gender
     **/
    @ApiModelProperty(value = "")

    public String getGender() {
        return gender;
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
     * Get identificationMark
     * @return identificationMark
     **/
    @ApiModelProperty(value = "")

    @Size(max=300)   public String getIdentificationMark() {
        return identificationMark;
    }

    /**
     * Get institutionId
     * @return institutionId
     **/
    @ApiModelProperty(value = "")

    public String getInstitutionId() {
        return institutionId;
    }

    /**
     * Get isPrimaryOwner
     * @return isPrimaryOwner
     **/
    @ApiModelProperty(value = "")

    public Boolean isisIsPrimaryOwner() {
        return isPrimaryOwner;
    }

    /**
     * Get lastModifiedBy
     * @return lastModifiedBy
     **/
    @ApiModelProperty(value = "")

    @Size(max=64)   public String getLastModifiedBy() {
        return lastModifiedBy;
    }

    /**
     * Get lastModifiedDate
     * @return lastModifiedDate
     **/
    @ApiModelProperty(value = "")

    public Long getLastModifiedDate() {
        return lastModifiedDate;
    }

    /**
     * Get locale
     * @return locale
     **/
    @ApiModelProperty(value = "")

    @Size(max=16)   public String getLocale() {
        return locale;
    }

    /**
     * Get mobileNumber
     * @return mobileNumber
     **/
    @ApiModelProperty(required = true, value = "")
    @NotNull

    public String getMobileNumber() {
        return mobileNumber;
    }

    /**
     * Get name
     * @return name
     **/
    @ApiModelProperty(required = true, value = "")
    @NotNull

    @Pattern(regexp="^[a-zA-Z0-9 \\-'`\\.]*$") @Size(max=100)   public String getName() {
        return name;
    }

    /**
     * Get ownerInfoUuid
     * @return ownerInfoUuid
     **/
    @ApiModelProperty(value = "")

    public String getOwnerInfoUuid() {
        return ownerInfoUuid;
    }

    /**
     * Get ownerShipPercentage
     * @return ownerShipPercentage
     **/
    @ApiModelProperty(value = "")

    public Double getOwnerShipPercentage() {
        return ownerShipPercentage;
    }

    /**
     * Get ownerType
     * @return ownerType
     **/
    @ApiModelProperty(required = true, value = "")
    @NotNull

    public String getOwnerType() {
        return ownerType;
    }

    /**
     * Get pan
     * @return pan
     **/
    @ApiModelProperty(value = "")

    @Size(max=10)   public String getPan() {
        return pan;
    }

    /**
     * Get password
     * @return password
     **/
    @ApiModelProperty(value = "")

    @Size(max=64)   public String getPassword() {
        return password;
    }

    /**
     * Get permanentAddress
     * @return permanentAddress
     **/
    @ApiModelProperty(value = "")

    @Size(max=300)   public String getPermanentAddress() {
        return permanentAddress;
    }

    /**
     * Get permanentCity
     * @return permanentCity
     **/
    @ApiModelProperty(value = "")

    @Size(max=300)   public String getPermanentCity() {
        return permanentCity;
    }

    /**
     * Get permanentPinCode
     * @return permanentPinCode
     **/
    @ApiModelProperty(value = "")

    @Size(max=10)   public String getPermanentPinCode() {
        return permanentPinCode;
    }

    /**
     * Get photo
     * @return photo
     **/
    @ApiModelProperty(value = "")

    @Size(max=36)   public String getPhoto() {
        return photo;
    }

    /**
     * Get pwdExpiryDate
     * @return pwdExpiryDate
     **/
    @ApiModelProperty(value = "")

    public Long getPwdExpiryDate() {
        return pwdExpiryDate;
    }

    /**
     * Get relationship
     * @return relationship
     **/
    @ApiModelProperty(value = "")

    public String getRelationship() {
        return relationship;
    }

    public OwnerInfo addRolesItem(Role rolesItem) {
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
     * Get salutation
     * @return salutation
     **/
    @ApiModelProperty(value = "")

    public String getSalutation() {
        return salutation;
    }

    /**
     * Get signature
     * @return signature
     **/
    @ApiModelProperty(value = "")

    @Size(max=36)   public String getSignature() {
        return signature;
    }

    /**
     * Get status
     * @return status
     **/
    @ApiModelProperty(value = "")

    public StatusEnum getStatus() {
        return status;
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

    @Size(max=64)   public String getUserName() {
        return userName;
    }

    /**
     * Get uuid
     * @return uuid
     **/
    @ApiModelProperty(value = "")

    @Size(max=64)   public String getUuid() {
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
        OwnerInfo ownerInfo = (OwnerInfo) o;
        return Objects.equals(this.aadhaarNumber, ownerInfo.aadhaarNumber) &&
                Objects.equals(this.accountLocked, ownerInfo.accountLocked) &&
                Objects.equals(this.active, ownerInfo.active) &&
                Objects.equals(this.altContactNumber, ownerInfo.altContactNumber) &&
                Objects.equals(this.bloodGroup, ownerInfo.bloodGroup) &&
                Objects.equals(this.correspondenceAddress, ownerInfo.correspondenceAddress) &&
                Objects.equals(this.correspondenceCity, ownerInfo.correspondenceCity) &&
                Objects.equals(this.correspondencePinCode, ownerInfo.correspondencePinCode) &&
                Objects.equals(this.createdBy, ownerInfo.createdBy) &&
                Objects.equals(this.createdDate, ownerInfo.createdDate) &&
                Objects.equals(this.dob, ownerInfo.dob) &&
                Objects.equals(this.documents, ownerInfo.documents) &&
                Objects.equals(this.emailId, ownerInfo.emailId) &&
                Objects.equals(this.fatherOrHusbandName, ownerInfo.fatherOrHusbandName) &&
                Objects.equals(this.gender, ownerInfo.gender) &&
                Objects.equals(this.id, ownerInfo.id) &&
                Objects.equals(this.identificationMark, ownerInfo.identificationMark) &&
                Objects.equals(this.institutionId, ownerInfo.institutionId) &&
                Objects.equals(this.isPrimaryOwner, ownerInfo.isPrimaryOwner) &&
                Objects.equals(this.lastModifiedBy, ownerInfo.lastModifiedBy) &&
                Objects.equals(this.lastModifiedDate, ownerInfo.lastModifiedDate) &&
                Objects.equals(this.locale, ownerInfo.locale) &&
                Objects.equals(this.mobileNumber, ownerInfo.mobileNumber) &&
                Objects.equals(this.name, ownerInfo.name) &&
                Objects.equals(this.ownerInfoUuid, ownerInfo.ownerInfoUuid) &&
                Objects.equals(this.ownerShipPercentage, ownerInfo.ownerShipPercentage) &&
                Objects.equals(this.ownerType, ownerInfo.ownerType) &&
                Objects.equals(this.pan, ownerInfo.pan) &&
                Objects.equals(this.password, ownerInfo.password) &&
                Objects.equals(this.permanentAddress, ownerInfo.permanentAddress) &&
                Objects.equals(this.permanentCity, ownerInfo.permanentCity) &&
                Objects.equals(this.permanentPinCode, ownerInfo.permanentPinCode) &&
                Objects.equals(this.photo, ownerInfo.photo) &&
                Objects.equals(this.pwdExpiryDate, ownerInfo.pwdExpiryDate) &&
                Objects.equals(this.relationship, ownerInfo.relationship) &&
                Objects.equals(this.roles, ownerInfo.roles) &&
                Objects.equals(this.salutation, ownerInfo.salutation) &&
                Objects.equals(this.signature, ownerInfo.signature) &&
                Objects.equals(this.status, ownerInfo.status) &&
                Objects.equals(this.tenantId, ownerInfo.tenantId) &&
                Objects.equals(this.type, ownerInfo.type) &&
                Objects.equals(this.userName, ownerInfo.userName) &&
                Objects.equals(this.uuid, ownerInfo.uuid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(aadhaarNumber, accountLocked, active, altContactNumber, bloodGroup, correspondenceAddress, correspondenceCity, correspondencePinCode, createdBy, createdDate, dob, documents, emailId, fatherOrHusbandName, gender, id, identificationMark, institutionId, isPrimaryOwner, lastModifiedBy, lastModifiedDate, locale, mobileNumber, name, ownerInfoUuid, ownerShipPercentage, ownerType, pan, password, permanentAddress, permanentCity, permanentPinCode, photo, pwdExpiryDate, relationship, roles, salutation, signature, status, tenantId, type, userName, uuid);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OwnerInfo {\n");

        sb.append("    aadhaarNumber: ").append(toIndentedString(aadhaarNumber)).append("\n");
        sb.append("    accountLocked: ").append(toIndentedString(accountLocked)).append("\n");
        sb.append("    active: ").append(toIndentedString(active)).append("\n");
        sb.append("    altContactNumber: ").append(toIndentedString(altContactNumber)).append("\n");
        sb.append("    bloodGroup: ").append(toIndentedString(bloodGroup)).append("\n");
        sb.append("    correspondenceAddress: ").append(toIndentedString(correspondenceAddress)).append("\n");
        sb.append("    correspondenceCity: ").append(toIndentedString(correspondenceCity)).append("\n");
        sb.append("    correspondencePinCode: ").append(toIndentedString(correspondencePinCode)).append("\n");
        sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
        sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
        sb.append("    dob: ").append(toIndentedString(dob)).append("\n");
        sb.append("    documents: ").append(toIndentedString(documents)).append("\n");
        sb.append("    emailId: ").append(toIndentedString(emailId)).append("\n");
        sb.append("    fatherOrHusbandName: ").append(toIndentedString(fatherOrHusbandName)).append("\n");
        sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    identificationMark: ").append(toIndentedString(identificationMark)).append("\n");
        sb.append("    institutionId: ").append(toIndentedString(institutionId)).append("\n");
        sb.append("    isPrimaryOwner: ").append(toIndentedString(isPrimaryOwner)).append("\n");
        sb.append("    lastModifiedBy: ").append(toIndentedString(lastModifiedBy)).append("\n");
        sb.append("    lastModifiedDate: ").append(toIndentedString(lastModifiedDate)).append("\n");
        sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
        sb.append("    mobileNumber: ").append(toIndentedString(mobileNumber)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    ownerInfoUuid: ").append(toIndentedString(ownerInfoUuid)).append("\n");
        sb.append("    ownerShipPercentage: ").append(toIndentedString(ownerShipPercentage)).append("\n");
        sb.append("    ownerType: ").append(toIndentedString(ownerType)).append("\n");
        sb.append("    pan: ").append(toIndentedString(pan)).append("\n");
        sb.append("    password: ").append(toIndentedString(password)).append("\n");
        sb.append("    permanentAddress: ").append(toIndentedString(permanentAddress)).append("\n");
        sb.append("    permanentCity: ").append(toIndentedString(permanentCity)).append("\n");
        sb.append("    permanentPinCode: ").append(toIndentedString(permanentPinCode)).append("\n");
        sb.append("    photo: ").append(toIndentedString(photo)).append("\n");
        sb.append("    pwdExpiryDate: ").append(toIndentedString(pwdExpiryDate)).append("\n");
        sb.append("    relationship: ").append(toIndentedString(relationship)).append("\n");
        sb.append("    roles: ").append(toIndentedString(roles)).append("\n");
        sb.append("    salutation: ").append(toIndentedString(salutation)).append("\n");
        sb.append("    signature: ").append(toIndentedString(signature)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
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