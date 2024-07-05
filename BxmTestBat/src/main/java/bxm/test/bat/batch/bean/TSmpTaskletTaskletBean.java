package bxm.test.bat.batch.bean;

import bxm.common.annotaion.BxmCategory;
import bxm.container.annotation.BxmBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;
import org.springframework.context.annotation.Scope;

/**
 * 
 *
 * @author sysadmin
*/
@Scope("step")
@BxmBean("TSmpTaskletTaskletBean")
@BxmCategory(logicalName="TSmpTasklet Tasklet Bean", description="", author="sysadmin")
public class TSmpTaskletTaskletBean implements Tasklet
{
	final Logger logger = LoggerFactory.getLogger(this.getClass());
	/**
	 * Tasklet
	 *  - 단순 DB CRUD 수행이나 반드시 한 번에 Commit/Rollback 되어야 하는 배치에서 사용하는 패턴
	 */
	@Override
	@BxmCategory(logicalName="TSmpTasklet Tasklet Bean", description="", author="sysadmin")
	public RepeatStatus execute(StepContribution stepContribution, ChunkContext chunkContext) throws Exception
	{
		return RepeatStatus.FINISHED;
	}
}
