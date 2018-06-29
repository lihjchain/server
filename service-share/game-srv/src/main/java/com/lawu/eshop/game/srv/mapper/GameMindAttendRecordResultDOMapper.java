package com.lawu.eshop.game.srv.mapper;

import com.lawu.eshop.game.srv.domain.GameMindAttendRecordResultDO;
import com.lawu.eshop.game.srv.domain.GameMindAttendRecordResultDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface GameMindAttendRecordResultDOMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table game_mind_attend_record_result
     *
     * @mbg.generated
     */
    long countByExample(GameMindAttendRecordResultDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table game_mind_attend_record_result
     *
     * @mbg.generated
     */
    int deleteByExample(GameMindAttendRecordResultDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table game_mind_attend_record_result
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table game_mind_attend_record_result
     *
     * @mbg.generated
     */
    int insert(GameMindAttendRecordResultDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table game_mind_attend_record_result
     *
     * @mbg.generated
     */
    int insertSelective(GameMindAttendRecordResultDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table game_mind_attend_record_result
     *
     * @mbg.generated
     */
    List<GameMindAttendRecordResultDO> selectByExampleWithRowbounds(GameMindAttendRecordResultDOExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table game_mind_attend_record_result
     *
     * @mbg.generated
     */
    List<GameMindAttendRecordResultDO> selectByExample(GameMindAttendRecordResultDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table game_mind_attend_record_result
     *
     * @mbg.generated
     */
    GameMindAttendRecordResultDO selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table game_mind_attend_record_result
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") GameMindAttendRecordResultDO record, @Param("example") GameMindAttendRecordResultDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table game_mind_attend_record_result
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") GameMindAttendRecordResultDO record, @Param("example") GameMindAttendRecordResultDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table game_mind_attend_record_result
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(GameMindAttendRecordResultDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table game_mind_attend_record_result
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(GameMindAttendRecordResultDO record);
}