package com.tahsinsayeed.faust.business.interactor;

import com.tahsinsayeed.faust.business.entity.*;
import com.tahsinsayeed.faust.business.entity.Class;
import com.tahsinsayeed.faust.persistence.repository.*;
import org.junit.*;

import java.time.*;
import java.util.*;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.mockito.Mockito.*;

public class UpcomingTaskRetrieverTest {

    private UpcomingTaskRetriever interactor;
    private RepositoryFactoryStub factoryStub;


    @Before
    public void setUp() throws Exception {
        factoryStub = new RepositoryFactoryStub();
        interactor = UpcomingTaskRetriever.create(LocalDate.now(), factoryStub);
    }


    private List<Class> manyClasses(LocalDate date, int n) {

        List<Class> classes = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            classes.add(Class.create("courseId",
                    date.getDayOfWeek(), LocalTime.of(8, 30)));
        }

        return classes;
    }

    private List<Exam> manyExamsWithDate(LocalDate date, int n) {

        List<Exam> exams = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            exams.add(Exam.create("exam","course", date, LocalTime.of(8, 30)));
        }

        return exams;
    }

    private List<Assignment> manyAssignmentsWithDate(LocalDate date, int n) {
        List<Assignment> assignments = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            assignments.add(Assignment.create("course","exam", LocalDate.now()));
        }

        return assignments;
    }


//    @Test
//    public void todaysTask() throws Exception {
//
//        assertThat(, );
//    }
//
//    @Test
//    public void testGetClassesForToday() throws Exception {
//        List<Class> classesWithTodaysDate = manyClasses(LocalDate.now(), 5);
//        Repository<Class> classRepositoryStub = mock(ClassRepository.class);
//        when(classRepositoryStub.getAll()).thenReturn(classesWithTodaysDate);
//        factoryStub.classRepository = classRepositoryStub;
//
//        assertThat(interactor.getTodaysClasses(LocalDate.now()), equalTo(classesWithTodaysDate));
//    }
//
//    @Test
//    public void testGetExamsOnToday() throws Exception {
//        List<Exam> examsWithTodaysDate = manyExamsWithDate(LocalDate.now(), 5);
//        Repository<Exam> examRepositoryStub = mock(ExamRepository.class);
//        when(examRepositoryStub.getAll()).thenReturn(examsWithTodaysDate);
//        factoryStub.examRepository = examRepositoryStub;
//
//        assertThat(interactor.getTodaysExams(LocalDate.now()), equalTo(examsWithTodaysDate));
//    }
//
//    @Test
//    public void testGetAssignmentsOnToday() throws Exception {
//
//        List<Assignment> assignmentsWithTodaysDate = manyAssignmentsWithDate(LocalDate.now(), 5);
//
//        Repository<Assignment> assignmentRepositoryStub = mock(AssignmentRepository.class);
//        when(assignmentRepositoryStub.getAll()).thenReturn(assignmentsWithTodaysDate);
//
//        factoryStub.assignmentRepository = assignmentRepositoryStub;
//
//        assertThat(interactor.getTodaysAssignments(LocalDate.now()), equalTo(assignmentsWithTodaysDate));
//    }
}
