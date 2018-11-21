package fr.inti.junit;

import java.util.Date;











import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;









import fr.inti.config.JPAConfig;
import fr.inti.dao.client.IClientDao;
import fr.inti.dao.client.IContactDao;
import fr.inti.dao.commercial.ICommercialDao;
import fr.inti.dao.commercial.ICommunicationDao;
import fr.inti.model.client.Client;
import fr.inti.model.client.Contact;
import fr.inti.model.client.Particulier;
import fr.inti.model.commercial.Commercial;
import fr.inti.model.commercial.Communication;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { JPAConfig.class })
public class TestDAO {

	@Autowired
	public IClientDao clientdao;
	@Autowired
	public IContactDao daoCt;
	@Autowired
	public ICommercialDao daocomm;
	@Autowired
	public ICommunicationDao daoCommuni;
	
	
	@Test
	public void testClient() {
		Client cl1 = new Particulier("ancien", "gros", "123456789", "bob", "boby", new Date(), 7, "celibataire", "chomeur", 12);
		clientdao.save(cl1);
		
		Client cl1Base = clientdao.findOne(1L);
		Assert.assertNotNull(cl1Base);
		
		Contact ct1 = new Contact("bob", "bobby", "copain");
		ct1.setClient(cl1);
		daoCt.save(ct1);
		Contact ct1Base = daoCt.findOne(1L);
		Assert.assertNotNull(ct1Base);
		
		Commercial com1 = new Commercial("com", "com", "jhbh", new Date(), 123, "123", 1);
		daocomm.save(com1);
		Commercial com1Base = daocomm.findOne(1L);
		Assert.assertNotNull(com1Base);
		
		Communication commu = new Communication(new Date(), 12, "la", "media", "truc", com1, ct1);
		daoCommuni.save(commu);
		

		
		;
	}

}
