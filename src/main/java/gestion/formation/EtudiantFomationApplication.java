package gestion.formation;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

@SpringBootApplication
public class EtudiantFomationApplication implements CommandLineRunner{
    @Autowired
	private EtudiantRepository etudiantRepository;
    @Autowired
	private FormationRepository formationRepository;
    @Autowired
    private RepositoryRestConfiguration repositoryRestConfiguration;
	public static void main(String[] args) {
		SpringApplication.run(EtudiantFomationApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		repositoryRestConfiguration.exposeIdsFor(Etudiant.class,Formation.class);
        /*Formation f1=formationRepository.save(new Formation("Spring boot", 30));
        Formation f2=formationRepository.save(new Formation("Spring boot", 30));
        Formation f3=formationRepository.save(new Formation("Spring boot", 30));
		etudiantRepository.save(new Etudiant("Mohamed","Ahmed",new Date(),f1));
		etudiantRepository.save(new Etudiant("babe","Ahmed",new Date(),f2));
		etudiantRepository.save(new Etudiant("brahim","Ahmed",new Date(),f3));*/
		
		
	}
}
