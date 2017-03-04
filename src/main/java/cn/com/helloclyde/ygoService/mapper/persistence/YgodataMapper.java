package cn.com.helloclyde.ygoService.mapper.persistence;

import cn.com.helloclyde.ygoService.mapper.model.Ygodata;
import cn.com.helloclyde.ygoService.mapper.model.YgodataExample;
import cn.com.helloclyde.ygoService.mapper.model.YgodataWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YgodataMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ygodata
     *
     * @mbggenerated Fri Mar 03 23:10:22 CST 2017
     */
    int countByExample(YgodataExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ygodata
     *
     * @mbggenerated Fri Mar 03 23:10:22 CST 2017
     */
    int deleteByExample(YgodataExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ygodata
     *
     * @mbggenerated Fri Mar 03 23:10:22 CST 2017
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ygodata
     *
     * @mbggenerated Fri Mar 03 23:10:22 CST 2017
     */
    int insert(YgodataWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ygodata
     *
     * @mbggenerated Fri Mar 03 23:10:22 CST 2017
     */
    int insertSelective(YgodataWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ygodata
     *
     * @mbggenerated Fri Mar 03 23:10:22 CST 2017
     */
    List<YgodataWithBLOBs> selectByExampleWithBLOBs(YgodataExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ygodata
     *
     * @mbggenerated Fri Mar 03 23:10:22 CST 2017
     */
    List<Ygodata> selectByExample(YgodataExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ygodata
     *
     * @mbggenerated Fri Mar 03 23:10:22 CST 2017
     */
    YgodataWithBLOBs selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ygodata
     *
     * @mbggenerated Fri Mar 03 23:10:22 CST 2017
     */
    int updateByExampleSelective(@Param("record") YgodataWithBLOBs record, @Param("example") YgodataExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ygodata
     *
     * @mbggenerated Fri Mar 03 23:10:22 CST 2017
     */
    int updateByExampleWithBLOBs(@Param("record") YgodataWithBLOBs record, @Param("example") YgodataExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ygodata
     *
     * @mbggenerated Fri Mar 03 23:10:22 CST 2017
     */
    int updateByExample(@Param("record") Ygodata record, @Param("example") YgodataExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ygodata
     *
     * @mbggenerated Fri Mar 03 23:10:22 CST 2017
     */
    int updateByPrimaryKeySelective(YgodataWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ygodata
     *
     * @mbggenerated Fri Mar 03 23:10:22 CST 2017
     */
    int updateByPrimaryKeyWithBLOBs(YgodataWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ygodata
     *
     * @mbggenerated Fri Mar 03 23:10:22 CST 2017
     */
    int updateByPrimaryKey(Ygodata record);
}