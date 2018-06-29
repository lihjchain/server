package com.lawu.eshop.game.srv.bo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import com.lawu.eshop.cache.constants.GameConfigStatusEnum;
import com.lawu.eshop.common.constants.EnableEnum;

public class GamePuzzleConfigBO implements Serializable {
    /**
     *
     * 
     * game_puzzle_config.id
     *
     * @mbg.generated
     */
    private Long id;

    /**
     *
     * 每次参与花费积分
     * game_puzzle_config.attend_point
     *
     * @mbg.generated
     */
    private Integer attendPoint;

    /**
     *
     * 每个房间最大可参入人数
     * game_puzzle_config.room_max_num
     *
     * @mbg.generated
     */
    private Integer roomMaxNum;

    /**
     *
     * 分享可免费次数
     * game_puzzle_config.share_attend_count
     *
     * @mbg.generated
     */
    private Integer shareAttendCount;

    /**
     *
     * 游戏倒计时
     * game_puzzle_config.count_down
     *
     * @mbg.generated
     */
    private Integer countDown;
    
    private Integer picCount;

    /**
     *
     * 挑战成功奖励积分
     * game_puzzle_config.award_point
     *
     * @mbg.generated
     */
    private Integer awardPoint;
    
    private String forbiddenRemark;

    /**
     *
     * 挑战成功奖励星星
     * game_puzzle_config.award_star
     *
     * @mbg.generated
     */
    private Integer awardStar;

    /**
     *
     * 挑战失败扣除星星
     * game_puzzle_config.deduct_star
     *
     * @mbg.generated
     */
    private Integer deductStar;

    /**
     *
     * 倒计时对应评分{"list":[{"second":3,"score":200},{"second":5,"score":150},{"second":10,"score":100}]}
     * game_puzzle_config.sec_score
     *
     * @mbg.generated
     */
    private String secScore;

    /**
     *
     * 游戏状态  0-禁用  1-启用
     * game_puzzle_config.status
     *
     * @mbg.generated
     */
    private GameConfigStatusEnum statusEnum;

    /**
     *
     * 更新时间
     * game_puzzle_config.gmt_modified
     *
     * @mbg.generated
     */
    private Date gmtModified;

    /**
     *
     * 创建时间
     * game_puzzle_config.gmt_create
     *
     * @mbg.generated
     */
    private Date gmtCreate;
    
    
    private Integer attendMaxPoint;
    
    private Integer freeCount;
    
    private List<GamePointAllotBO> allots;
    
    private List<GamePuzzleDifficultyBO> difficultys;
    
    private Integer successScore;
    
    private EnableEnum robotStatus;
    
    private Integer robotEffectiveTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table game_puzzle_config
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column game_puzzle_config.id
     *
     * @return the value of game_puzzle_config.id
     *
     * @mbg.generated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column game_puzzle_config.id
     *
     * @param id the value for game_puzzle_config.id
     *
     * @mbg.generated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column game_puzzle_config.attend_point
     *
     * @return the value of game_puzzle_config.attend_point
     *
     * @mbg.generated
     */
    public Integer getAttendPoint() {
        return attendPoint;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column game_puzzle_config.attend_point
     *
     * @param attendPoint the value for game_puzzle_config.attend_point
     *
     * @mbg.generated
     */
    public void setAttendPoint(Integer attendPoint) {
        this.attendPoint = attendPoint;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column game_puzzle_config.room_max_num
     *
     * @return the value of game_puzzle_config.room_max_num
     *
     * @mbg.generated
     */
    public Integer getRoomMaxNum() {
        return roomMaxNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column game_puzzle_config.room_max_num
     *
     * @param roomMaxNum the value for game_puzzle_config.room_max_num
     *
     * @mbg.generated
     */
    public void setRoomMaxNum(Integer roomMaxNum) {
        this.roomMaxNum = roomMaxNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column game_puzzle_config.share_attend_count
     *
     * @return the value of game_puzzle_config.share_attend_count
     *
     * @mbg.generated
     */
    public Integer getShareAttendCount() {
        return shareAttendCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column game_puzzle_config.share_attend_count
     *
     * @param shareAttendCount the value for game_puzzle_config.share_attend_count
     *
     * @mbg.generated
     */
    public void setShareAttendCount(Integer shareAttendCount) {
        this.shareAttendCount = shareAttendCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column game_puzzle_config.count_down
     *
     * @return the value of game_puzzle_config.count_down
     *
     * @mbg.generated
     */
    public Integer getCountDown() {
        return countDown;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column game_puzzle_config.count_down
     *
     * @param countDown the value for game_puzzle_config.count_down
     *
     * @mbg.generated
     */
    public void setCountDown(Integer countDown) {
        this.countDown = countDown;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column game_puzzle_config.award_point
     *
     * @return the value of game_puzzle_config.award_point
     *
     * @mbg.generated
     */
    public Integer getAwardPoint() {
        return awardPoint;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column game_puzzle_config.award_point
     *
     * @param awardPoint the value for game_puzzle_config.award_point
     *
     * @mbg.generated
     */
    public void setAwardPoint(Integer awardPoint) {
        this.awardPoint = awardPoint;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column game_puzzle_config.award_star
     *
     * @return the value of game_puzzle_config.award_star
     *
     * @mbg.generated
     */
    public Integer getAwardStar() {
        return awardStar;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column game_puzzle_config.award_star
     *
     * @param awardStar the value for game_puzzle_config.award_star
     *
     * @mbg.generated
     */
    public void setAwardStar(Integer awardStar) {
        this.awardStar = awardStar;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column game_puzzle_config.deduct_star
     *
     * @return the value of game_puzzle_config.deduct_star
     *
     * @mbg.generated
     */
    public Integer getDeductStar() {
        return deductStar;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column game_puzzle_config.deduct_star
     *
     * @param deductStar the value for game_puzzle_config.deduct_star
     *
     * @mbg.generated
     */
    public void setDeductStar(Integer deductStar) {
        this.deductStar = deductStar;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column game_puzzle_config.sec_score
     *
     * @return the value of game_puzzle_config.sec_score
     *
     * @mbg.generated
     */
    public String getSecScore() {
        return secScore;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column game_puzzle_config.sec_score
     *
     * @param secScore the value for game_puzzle_config.sec_score
     *
     * @mbg.generated
     */
    public void setSecScore(String secScore) {
        this.secScore = secScore == null ? null : secScore.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column game_puzzle_config.status
     *
     * @return the value of game_puzzle_config.status
     *
     * @mbg.generated
     */
    public GameConfigStatusEnum getStatusEnum() {
		return statusEnum;
	}

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column game_puzzle_config.status
     *
     * @param status the value for game_puzzle_config.status
     *
     * @mbg.generated
     */
    public void setStatusEnum(GameConfigStatusEnum statusEnum) {
		this.statusEnum = statusEnum;
	}

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column game_puzzle_config.gmt_modified
     *
     * @return the value of game_puzzle_config.gmt_modified
     *
     * @mbg.generated
     */
    public Date getGmtModified() {
        return gmtModified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column game_puzzle_config.gmt_modified
     *
     * @param gmtModified the value for game_puzzle_config.gmt_modified
     *
     * @mbg.generated
     */
    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column game_puzzle_config.gmt_create
     *
     * @return the value of game_puzzle_config.gmt_create
     *
     * @mbg.generated
     */
    public Date getGmtCreate() {
        return gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column game_puzzle_config.gmt_create
     *
     * @param gmtCreate the value for game_puzzle_config.gmt_create
     *
     * @mbg.generated
     */
    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

	public Integer getAttendMaxPoint() {
		return attendMaxPoint;
	}

	public void setAttendMaxPoint(Integer attendMaxPoint) {
		this.attendMaxPoint = attendMaxPoint;
	}

	public Integer getFreeCount() {
		return freeCount;
	}

	public void setFreeCount(Integer freeCount) {
		this.freeCount = freeCount;
	}

	public Integer getPicCount() {
		return picCount;
	}

	public void setPicCount(Integer picCount) {
		this.picCount = picCount;
	}

	public List<GamePointAllotBO> getAllots() {
		return allots;
	}

	public void setAllots(List<GamePointAllotBO> allots) {
		this.allots = allots;
	}

	public List<GamePuzzleDifficultyBO> getDifficultys() {
		return difficultys;
	}

	public void setDifficultys(List<GamePuzzleDifficultyBO> difficultys) {
		this.difficultys = difficultys;
	}

	public Integer getSuccessScore() {
		return successScore;
	}

	public void setSuccessScore(Integer successScore) {
		this.successScore = successScore;
	}

	public String getForbiddenRemark() {
		return forbiddenRemark;
	}

	public void setForbiddenRemark(String forbiddenRemark) {
		this.forbiddenRemark = forbiddenRemark;
	}

	public EnableEnum getRobotStatus() {
		return robotStatus;
	}

	public void setRobotStatus(EnableEnum robotStatus) {
		this.robotStatus = robotStatus;
	}

	public Integer getRobotEffectiveTime() {
		return robotEffectiveTime;
	}

	public void setRobotEffectiveTime(Integer robotEffectiveTime) {
		this.robotEffectiveTime = robotEffectiveTime;
	}
	
    
}