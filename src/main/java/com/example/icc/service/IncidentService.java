public interface IncidentService {
    Incident create(IncidentRequestDto dto);
    List<Incident> findAll();
    Incident updateStatus(Long id, IncidentStatus status);
}
