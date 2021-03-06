package com.lawu.eshop.game.srv.domain;

import java.io.Serializable;
import java.util.Date;

public class GameDialAccountDO implements Serializable {
    /**
     *
     * 主键
     * game_dial_account.id
     *
     * @mbg.generated
     */
    private Long id;

    /**
     *
     * 用户编号
     * game_dial_account.user_num
     *
     * @mbg.generated
     */
    private String userNum;

    /**
     *
     * 剩余免费次数
     * game_dial_account.free_count
     *
     * @mbg.generated
     */
    private Integer freeCount;

    /**
     *
     * 分享免费次数
     * game_dial_account.share_attend_count
     *
     * @mbg.generated
     */
    private Integer shareAttendCount;

    /**
     *
     * 是否分享获得免费次数
     * game_dial_account.is_get_free
     *
     * @mbg.generated
     */
    private Boolean isGetFree;

    /**
     *
     * 修改时间
     * game_dial_account.gmt_modified
     *
     * @mbg.generated
     */
    private Date gmtModified;

    /**
     *
     * 创建时间
     * game_dial_account.gmt_create
     *
     * @mbg.generated
     */
    private Date gmtCreate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table game_dial_account
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column game_dial_account.id
     *
     * @return the value of game_dial_account.id
     *
     * @mbg.generated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column game_dial_account.id
     *
     * @param id the value for game_dial_account.id
     *
     * @mbg.generated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column game_dial_account.user_num
     *
     * @return the value of game_dial_account.user_num
     *
     * @mbg.generated
     */
    public String getUserNum() {
        return userNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column game_dial_account.user_num
     *
     * @param userNum the value for game_dial_account.user_num
     *
     * @mbg.generated
     */
    public void setUserNum(String userNum) {
        this.userNum = userNum == null ? null : userNum.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column game_dial_account.free_count
     *
     * @return the value of game_dial_account.free_count
     *
     * @mbg.generated
     */
    public Integer getFreeCount() {
        return freeCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column game_dial_account.free_count
     *
     * @param freeCount the value for game_dial_account.free_count
     *
     * @mbg.generated
     */
    public void setFreeCount(Integer freeCount) {
        this.freeCount = freeCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column game_dial_account.share_attend_count
     *
     * @return the value of game_dial_account.share_attend_count
     *
     * @mbg.generated
     */
    public Integer getShareAttendCount() {
        return shareAttendCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column game_dial_account.share_attend_count
     *
     * @param shareAttendCount the value for game_dial_account.share_attend_count
     *
     * @mbg.generated
     */
    public void setShareAttendCount(Integer shareAttendCount) {
        this.shareAttendCount = shareAttendCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column game_dial_account.is_get_free
     *
     * @return the value of game_dial_account.is_get_free
     *
     * @mbg.generated
     */
    public Boolean getIsGetFree() {
        return isGetFree;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column game_dial_account.is_get_free
     *
     * @param isGetFree the value for game_dial_account.is_get_free
     *
     * @mbg.generated
     */
    public void setIsGetFree(Boolean isGetFree) {
        this.isGetFree = isGetFree;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column game_dial_account.gmt_modified
     *
     * @return the value of game_dial_account.gmt_modified
     *
     * @mbg.generated
     */
    public Date getGmtModified() {
        return gmtModified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column game_dial_account.gmt_modified
     *
     * @param gmtModified the value for game_dial_account.gmt_modified
     *
     * @mbg.generated
     */
    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column game_dial_account.gmt_create
     *
     * @return the value of game_dial_account.gmt_create
     *
     * @mbg.generated
     */
    public Date getGmtCreate() {
        return gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column game_dial_account.gmt_create
     *
     * @param gmtCreate the value for game_dial_account.gmt_create
     *
     * @mbg.generated
     */
    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }
}