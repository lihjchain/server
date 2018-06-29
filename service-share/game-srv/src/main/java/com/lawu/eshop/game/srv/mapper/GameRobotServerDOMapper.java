package com.lawu.eshop.game.srv.mapper;

import com.lawu.eshop.game.srv.domain.GameRobotServerDO;
import com.lawu.eshop.game.srv.domain.GameRobotServerDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface GameRobotServerDOMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table game_robot_server
     *
     * @mbg.generated
     */
    long countByExample(GameRobotServerDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table game_robot_server
     *
     * @mbg.generated
     */
    int deleteByExample(GameRobotServerDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table game_robot_server
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table game_robot_server
     *
     * @mbg.generated
     */
    int insert(GameRobotServerDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table game_robot_server
     *
     * @mbg.generated
     */
    int insertSelective(GameRobotServerDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table game_robot_server
     *
     * @mbg.generated
     */
    List<GameRobotServerDO> selectByExampleWithRowbounds(GameRobotServerDOExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table game_robot_server
     *
     * @mbg.generated
     */
    List<GameRobotServerDO> selectByExample(GameRobotServerDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table game_robot_server
     *
     * @mbg.generated
     */
    GameRobotServerDO selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table game_robot_server
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") GameRobotServerDO record, @Param("example") GameRobotServerDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table game_robot_server
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") GameRobotServerDO record, @Param("example") GameRobotServerDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table game_robot_server
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(GameRobotServerDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table game_robot_server
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(GameRobotServerDO record);
}