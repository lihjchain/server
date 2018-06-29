package com.lawu.eshop.game.srv.mapper;

import com.lawu.eshop.game.srv.domain.GameDialAccountDO;
import com.lawu.eshop.game.srv.domain.GameDialAccountDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface GameDialAccountDOMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table game_dial_account
     *
     * @mbg.generated
     */
    long countByExample(GameDialAccountDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table game_dial_account
     *
     * @mbg.generated
     */
    int deleteByExample(GameDialAccountDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table game_dial_account
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table game_dial_account
     *
     * @mbg.generated
     */
    int insert(GameDialAccountDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table game_dial_account
     *
     * @mbg.generated
     */
    int insertSelective(GameDialAccountDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table game_dial_account
     *
     * @mbg.generated
     */
    List<GameDialAccountDO> selectByExampleWithRowbounds(GameDialAccountDOExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table game_dial_account
     *
     * @mbg.generated
     */
    List<GameDialAccountDO> selectByExample(GameDialAccountDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table game_dial_account
     *
     * @mbg.generated
     */
    GameDialAccountDO selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table game_dial_account
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") GameDialAccountDO record, @Param("example") GameDialAccountDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table game_dial_account
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") GameDialAccountDO record, @Param("example") GameDialAccountDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table game_dial_account
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(GameDialAccountDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table game_dial_account
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(GameDialAccountDO record);
}