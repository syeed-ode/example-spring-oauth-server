package com.syeedode.auth.user;


/**
 * Authentication Services
 * <p>
 * Author: syeedode
 * Date: 9/2/17
 */
// @Entity(name = "user")
public class UserEntity {
//    @Id
//    @GeneratedValue(strategy = GenerationType.TABLE)
    private Integer id;

//    @Column(name = "uuid")
    private String partnerUuid;

//    @Column(name = "resourceUuid")
    private String resourceUuid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPartnerUuid() {
        return partnerUuid;
    }

    public void setPartnerUuid(String partnerUuid) {
        this.partnerUuid = partnerUuid;
    }

    public String getResourceUuid() {
        return resourceUuid;
    }

    public void setResourceUuid(String resourceUuid) {
        this.resourceUuid = resourceUuid;
    }
}
