package com.lawu.eshop.activity.srv.mapper;

import com.lawu.eshop.activity.srv.domain.PointLotteryActivityDO;
import com.lawu.eshop.activity.srv.domain.PointLotteryActivityDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface PointLotteryActivityDOMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table point_lottery_activity
     *
     * @mbg.generated
     */
    long countByExample(PointLotteryActivityDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table point_lottery_activity
     *
     * @mbg.generated
     */
    int deleteByExample(PointLotteryActivityDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table point_lottery_activity
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table point_lottery_activity
     *
     * @mbg.generated
     */
    int insert(PointLotteryActivityDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table point_lottery_activity
     *
     * @mbg.generated
     */
    int insertSelective(PointLotteryActivityDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table point_lottery_activity
     *
     * @mbg.generated
     */
    List<PointLotteryActivityDO> selectByExampleWithRowbounds(PointLotteryActivityDOExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table point_lottery_activity
     *
     * @mbg.generated
     */
    List<PointLotteryActivityDO> selectByExample(PointLotteryActivityDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table point_lottery_activity
     *
     * @mbg.generated
     */
    PointLotteryActivityDO selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table point_lottery_activity
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") PointLotteryActivityDO record, @Param("example") PointLotteryActivityDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table point_lottery_activity
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") PointLotteryActivityDO record, @Param("example") PointLotteryActivityDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table point_lottery_activity
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(PointLotteryActivityDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table point_lottery_activity
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(PointLotteryActivityDO record);
}