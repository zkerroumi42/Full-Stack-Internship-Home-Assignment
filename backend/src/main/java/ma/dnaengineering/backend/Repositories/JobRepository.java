package ma.dnaengineering.backend.Repositories;

import ma.dnaengineering.backend.models.Job;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface JobRepository extends JpaRepository<Job, Long> {
}