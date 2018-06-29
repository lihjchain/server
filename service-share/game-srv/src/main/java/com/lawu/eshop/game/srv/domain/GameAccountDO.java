package com.lawu.eshop.game.srv.domain;

import java.io.Serializable;
import java.util.Date;

public class GameAccountDO implements Serializable {
    /**
     *
     * 
     * game_account.id
     *
     * @mbg.generated
     */
    private Long id;

    /**
     *
     * 账号
     * game_account.account
     *
     * @mbg.generated
     */
    private String account;

    /**
     *
     * 用户编号
     * game_account.user_num
     *
     * @mbg.generated
     */
    private String userNum;

    /**
     *
     * 星星总数量
     * game_account.star_count
     *
     * @mbg.generated
     */
    private Integer starCount;

    /**
     *
     * 更新时间
     * game_account.gmt_modified
     *
     * @mbg.generated
     */
    private Date gmtModified;

    /**
     *
     * 创建时间
     * game_account.gmt_create
     *
     * @mbg.generated
     */
    private Date gmtCreate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table game_account
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column game_account.id
     *
     * @return the value of game_account.id
     *
     * @mbg.generated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column game_account.id
     *
     * @param id the value for game_account.id
     *
     * @mbg.generated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column game_account.account
     *
     * @return the value of game_account.account
     *
     * @mbg.generated
     */
    public String getAccount() {
        return account;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column game_account.account
     *
     * @param account the value for game_account.account
     *
     * @mbg.generated
     */
    public void setAccount(String account) {
        this.account = account == null ? null : account.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column game_account.user_num
     *
     * @return the value of game_account.user_num
     *
     * @mbg.generated
     */
    public String getUserNum() {
        return userNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column game_account.user_num
     *
     * @param userNum the value for game_account.user_num
     *
     * @mbg.generated
     */
    public void setUserNum(String userNum) {
        this.userNum = userNum == null ? null : userNum.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column game_account.star_count
     *
     * @return the value of game_account.star_count
     *
     * @mbg.generated
     */
    public Integer getStarCount() {
        return starCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column game_account.star_count
     *
     * @param starCount the value for game_account.star_count
     *
     * @mbg.generated
     */
    public void setStarCount(Integer starCount) {
        this.starCount = starCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column game_account.gmt_modified
     *
     * @return the value of game_account.gmt_modified
     *
     * @mbg.generated
     */
    public Date getGmtModified() {
        return gmtModified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column game_account.gmt_modified
     *
     * @param gmtModified the value for game_account.gmt_modified
     *
     * @mbg.generated
     */
    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column game_account.gmt_create
     *
     * @return the value of game_account.gmt_create
     *
     * @mbg.generated
     */
    public Date getGmtCreate() {
        return gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column game_account.gmt_create
     *
     * @param gmtCreate the value for game_account.gmt_create
     *
     * @mbg.generated
     */
    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }
}