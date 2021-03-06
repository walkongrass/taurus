package com.dp.bigdata.taurus.generated.mapper;

import com.dp.bigdata.taurus.generated.module.TaskIDCounter;
import com.dp.bigdata.taurus.generated.module.TaskIDCounterExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TaskIDCounterMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TaurusTaskIDCounter
     *
     * @mbggenerated Wed Sep 25 16:11:59 HKT 2013
     */
    int countByExample(TaskIDCounterExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TaurusTaskIDCounter
     *
     * @mbggenerated Wed Sep 25 16:11:59 HKT 2013
     */
    int deleteByExample(TaskIDCounterExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TaurusTaskIDCounter
     *
     * @mbggenerated Wed Sep 25 16:11:59 HKT 2013
     */
    int deleteByPrimaryKey(String taskid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TaurusTaskIDCounter
     *
     * @mbggenerated Wed Sep 25 16:11:59 HKT 2013
     */
    int insert(TaskIDCounter record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TaurusTaskIDCounter
     *
     * @mbggenerated Wed Sep 25 16:11:59 HKT 2013
     */
    int insertSelective(TaskIDCounter record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TaurusTaskIDCounter
     *
     * @mbggenerated Wed Sep 25 16:11:59 HKT 2013
     */
    List<TaskIDCounter> selectByExample(TaskIDCounterExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TaurusTaskIDCounter
     *
     * @mbggenerated Wed Sep 25 16:11:59 HKT 2013
     */
    TaskIDCounter selectByPrimaryKey(String taskid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TaurusTaskIDCounter
     *
     * @mbggenerated Wed Sep 25 16:11:59 HKT 2013
     */
    int updateByExampleSelective(@Param("record") TaskIDCounter record, @Param("example") TaskIDCounterExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TaurusTaskIDCounter
     *
     * @mbggenerated Wed Sep 25 16:11:59 HKT 2013
     */
    int updateByExample(@Param("record") TaskIDCounter record, @Param("example") TaskIDCounterExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TaurusTaskIDCounter
     *
     * @mbggenerated Wed Sep 25 16:11:59 HKT 2013
     */
    int updateByPrimaryKeySelective(TaskIDCounter record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TaurusTaskIDCounter
     *
     * @mbggenerated Wed Sep 25 16:11:59 HKT 2013
     */
    int updateByPrimaryKey(TaskIDCounter record);
}