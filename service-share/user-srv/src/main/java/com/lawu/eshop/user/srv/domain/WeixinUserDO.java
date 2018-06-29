package com.lawu.eshop.user.srv.domain;

import java.io.Serializable;
import java.util.Date;

public class WeixinUserDO implements Serializable {
    /**
     *
     * 主键
     * weixin_user.id
     *
     * @mbg.generated
     */
    private Long id;

    /**
     *
     * 用户编号
     * weixin_user.user_num
     *
     * @mbg.generated
     */
    private String userNum;

    /**
     *
     * 是否订阅公众号
     * weixin_user.subscribe
     *
     * @mbg.generated
     */
    private Integer subscribe;

    /**
     *
     * openid
     * weixin_user.openid
     *
     * @mbg.generated
     */
    private String openid;

    /**
     *
     * 昵称
     * weixin_user.nickname
     *
     * @mbg.generated
     */
    private String nickname;

    /**
     *
     * 性别
     * weixin_user.sex
     *
     * @mbg.generated
     */
    private Integer sex;

    /**
     *
     * 用户所在城市
     * weixin_user.city
     *
     * @mbg.generated
     */
    private String city;

    /**
     *
     * 用户所在国家
     * weixin_user.country
     *
     * @mbg.generated
     */
    private String country;

    /**
     *
     * 用户所在省份
     * weixin_user.province
     *
     * @mbg.generated
     */
    private String province;

    /**
     *
     * 用户的语言
     * weixin_user.language
     *
     * @mbg.generated
     */
    private String language;

    /**
     *
     * 头像
     * weixin_user.headimgurl
     *
     * @mbg.generated
     */
    private String headimgurl;

    /**
     *
     * 用户关注时间
     * weixin_user.subscribe_time
     *
     * @mbg.generated
     */
    private Date subscribeTime;

    /**
     *
     * 只有在用户将公众号绑定到微信开放平台帐号后，才会出现该字段
     * weixin_user.unionid
     *
     * @mbg.generated
     */
    private String unionid;

    /**
     *
     * 公众号运营者对粉丝的备注
     * weixin_user.remark
     *
     * @mbg.generated
     */
    private String remark;

    /**
     *
     * 用户所在的分组ID
     * weixin_user.groupid
     *
     * @mbg.generated
     */
    private Long groupid;

    /**
     *
     * 用户被打上的标签ID列表
     * weixin_user.tagid_list
     *
     * @mbg.generated
     */
    private String tagidList;

    /**
     *
     * 是否关注公众号
     * weixin_user.is_subscribe_mp
     *
     * @mbg.generated
     */
    private Boolean isSubscribeMp;

    /**
     *
     * 更新时间
     * weixin_user.gmt_modified
     *
     * @mbg.generated
     */
    private Date gmtModified;

    /**
     *
     * 创建时间
     * weixin_user.gmt_create
     *
     * @mbg.generated
     */
    private Date gmtCreate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table weixin_user
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column weixin_user.id
     *
     * @return the value of weixin_user.id
     *
     * @mbg.generated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column weixin_user.id
     *
     * @param id the value for weixin_user.id
     *
     * @mbg.generated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column weixin_user.user_num
     *
     * @return the value of weixin_user.user_num
     *
     * @mbg.generated
     */
    public String getUserNum() {
        return userNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column weixin_user.user_num
     *
     * @param userNum the value for weixin_user.user_num
     *
     * @mbg.generated
     */
    public void setUserNum(String userNum) {
        this.userNum = userNum == null ? null : userNum.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column weixin_user.subscribe
     *
     * @return the value of weixin_user.subscribe
     *
     * @mbg.generated
     */
    public Integer getSubscribe() {
        return subscribe;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column weixin_user.subscribe
     *
     * @param subscribe the value for weixin_user.subscribe
     *
     * @mbg.generated
     */
    public void setSubscribe(Integer subscribe) {
        this.subscribe = subscribe;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column weixin_user.openid
     *
     * @return the value of weixin_user.openid
     *
     * @mbg.generated
     */
    public String getOpenid() {
        return openid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column weixin_user.openid
     *
     * @param openid the value for weixin_user.openid
     *
     * @mbg.generated
     */
    public void setOpenid(String openid) {
        this.openid = openid == null ? null : openid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column weixin_user.nickname
     *
     * @return the value of weixin_user.nickname
     *
     * @mbg.generated
     */
    public String getNickname() {
        return nickname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column weixin_user.nickname
     *
     * @param nickname the value for weixin_user.nickname
     *
     * @mbg.generated
     */
    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column weixin_user.sex
     *
     * @return the value of weixin_user.sex
     *
     * @mbg.generated
     */
    public Integer getSex() {
        return sex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column weixin_user.sex
     *
     * @param sex the value for weixin_user.sex
     *
     * @mbg.generated
     */
    public void setSex(Integer sex) {
        this.sex = sex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column weixin_user.city
     *
     * @return the value of weixin_user.city
     *
     * @mbg.generated
     */
    public String getCity() {
        return city;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column weixin_user.city
     *
     * @param city the value for weixin_user.city
     *
     * @mbg.generated
     */
    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column weixin_user.country
     *
     * @return the value of weixin_user.country
     *
     * @mbg.generated
     */
    public String getCountry() {
        return country;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column weixin_user.country
     *
     * @param country the value for weixin_user.country
     *
     * @mbg.generated
     */
    public void setCountry(String country) {
        this.country = country == null ? null : country.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column weixin_user.province
     *
     * @return the value of weixin_user.province
     *
     * @mbg.generated
     */
    public String getProvince() {
        return province;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column weixin_user.province
     *
     * @param province the value for weixin_user.province
     *
     * @mbg.generated
     */
    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column weixin_user.language
     *
     * @return the value of weixin_user.language
     *
     * @mbg.generated
     */
    public String getLanguage() {
        return language;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column weixin_user.language
     *
     * @param language the value for weixin_user.language
     *
     * @mbg.generated
     */
    public void setLanguage(String language) {
        this.language = language == null ? null : language.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column weixin_user.headimgurl
     *
     * @return the value of weixin_user.headimgurl
     *
     * @mbg.generated
     */
    public String getHeadimgurl() {
        return headimgurl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column weixin_user.headimgurl
     *
     * @param headimgurl the value for weixin_user.headimgurl
     *
     * @mbg.generated
     */
    public void setHeadimgurl(String headimgurl) {
        this.headimgurl = headimgurl == null ? null : headimgurl.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column weixin_user.subscribe_time
     *
     * @return the value of weixin_user.subscribe_time
     *
     * @mbg.generated
     */
    public Date getSubscribeTime() {
        return subscribeTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column weixin_user.subscribe_time
     *
     * @param subscribeTime the value for weixin_user.subscribe_time
     *
     * @mbg.generated
     */
    public void setSubscribeTime(Date subscribeTime) {
        this.subscribeTime = subscribeTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column weixin_user.unionid
     *
     * @return the value of weixin_user.unionid
     *
     * @mbg.generated
     */
    public String getUnionid() {
        return unionid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column weixin_user.unionid
     *
     * @param unionid the value for weixin_user.unionid
     *
     * @mbg.generated
     */
    public void setUnionid(String unionid) {
        this.unionid = unionid == null ? null : unionid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column weixin_user.remark
     *
     * @return the value of weixin_user.remark
     *
     * @mbg.generated
     */
    public String getRemark() {
        return remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column weixin_user.remark
     *
     * @param remark the value for weixin_user.remark
     *
     * @mbg.generated
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column weixin_user.groupid
     *
     * @return the value of weixin_user.groupid
     *
     * @mbg.generated
     */
    public Long getGroupid() {
        return groupid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column weixin_user.groupid
     *
     * @param groupid the value for weixin_user.groupid
     *
     * @mbg.generated
     */
    public void setGroupid(Long groupid) {
        this.groupid = groupid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column weixin_user.tagid_list
     *
     * @return the value of weixin_user.tagid_list
     *
     * @mbg.generated
     */
    public String getTagidList() {
        return tagidList;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column weixin_user.tagid_list
     *
     * @param tagidList the value for weixin_user.tagid_list
     *
     * @mbg.generated
     */
    public void setTagidList(String tagidList) {
        this.tagidList = tagidList == null ? null : tagidList.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column weixin_user.is_subscribe_mp
     *
     * @return the value of weixin_user.is_subscribe_mp
     *
     * @mbg.generated
     */
    public Boolean getIsSubscribeMp() {
        return isSubscribeMp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column weixin_user.is_subscribe_mp
     *
     * @param isSubscribeMp the value for weixin_user.is_subscribe_mp
     *
     * @mbg.generated
     */
    public void setIsSubscribeMp(Boolean isSubscribeMp) {
        this.isSubscribeMp = isSubscribeMp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column weixin_user.gmt_modified
     *
     * @return the value of weixin_user.gmt_modified
     *
     * @mbg.generated
     */
    public Date getGmtModified() {
        return gmtModified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column weixin_user.gmt_modified
     *
     * @param gmtModified the value for weixin_user.gmt_modified
     *
     * @mbg.generated
     */
    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column weixin_user.gmt_create
     *
     * @return the value of weixin_user.gmt_create
     *
     * @mbg.generated
     */
    public Date getGmtCreate() {
        return gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column weixin_user.gmt_create
     *
     * @param gmtCreate the value for weixin_user.gmt_create
     *
     * @mbg.generated
     */
    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }
}