public class QueryClassroomService {
    @Autowired
    private ClassroomRepository classroomRepository;

    public List<Classroom> queryClassroom() {
        return classroomRepository.findAll();
    }
}
