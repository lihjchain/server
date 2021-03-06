package com.lawu.eshop.game.srv.mapper;

import com.lawu.eshop.game.srv.domain.GamePuzzleAccountDO;
import com.lawu.eshop.game.srv.domain.GamePuzzleAccountDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface GamePuzzleAccountDOMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table game_puzzle_account
     *
     * @mbg.generated
     */
    long countByExample(GamePuzzleAccountDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table game_puzzle_account
     *
     * @mbg.generated
     */
    int deleteByExample(GamePuzzleAccountDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table game_puzzle_account
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table game_puzzle_account
     *
     * @mbg.generated
     */
    int insert(GamePuzzleAccountDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table game_puzzle_account
     *
     * @mbg.generated
     */
    int insertSelective(GamePuzzleAccountDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table game_puzzle_account
     *
     * @mbg.generated
     */
    List<GamePuzzleAccountDO> selectByExampleWithRowbounds(GamePuzzleAccountDOExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table game_puzzle_account
     *
     * @mbg.generated
     */
    List<GamePuzzleAccountDO> selectByExample(GamePuzzleAccountDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table game_puzzle_account
     *
     * @mbg.generated
     */
    GamePuzzleAccountDO selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table game_puzzle_account
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") GamePuzzleAccountDO record, @Param("example") GamePuzzleAccountDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table game_puzzle_account
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") GamePuzzleAccountDO record, @Param("example") GamePuzzleAccountDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table game_puzzle_account
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(GamePuzzleAccountDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table game_puzzle_account
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(GamePuzzleAccountDO record);
}