package com.cts.MicroService.client.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cts.MicroService.client.model.MentorCalendar;
import com.cts.MicroService.client.model.MentorSkill;

public interface SearchRepository extends JpaRepository<MentorSkill,Long> {
	
			


@Query(value="select s.mentor_id from Mentor_Skill s inner join Mentor_Calendar c on c.mentor_id=s.mentor_id where name=?1 and c.startTime=?2 and c.endTime=?3",nativeQuery=true)	


public List<Long> innerjoin(String name,String startTime,String endTime);
}
