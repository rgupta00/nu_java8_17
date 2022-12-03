package com.demo;

import org.springframework.stereotype.Service;

@Service(value = "magician")
public class Magician {

	public void doMagic() {
		System.out.println("abra ka dabra..");
//		if(1==1)
//			throw new MagicianGotHeartAttack("magician got ha call the dr now");
	}
}
