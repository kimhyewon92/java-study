package homework.set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class LotteryController {
	Set<Lottery> lottery = new HashSet<Lottery>();
	Set<Lottery> win = new HashSet<Lottery>();
	
	public boolean insertObject(Lottery l) {
		return lottery.add(l);
	}
	public boolean deleteObject(Lottery l) {
		boolean removed = lottery.remove(l);
		if (removed && win != null) {
			win.remove(l);
		}
		return removed;
	}
	public Set<Lottery> searchObject() {
		return lottery;
	}
	public Set<Lottery> winObject() {
		if (lottery.size() > 4) {
			List<Lottery> lotteryWin = new ArrayList<Lottery>(lottery);
			int num = (int) (Math.random() * lotteryWin.size());
			
			return win;
		} else {
			return null;
		}
	}
	public Set<Lottery> sortedWinObject() {
		List<Lottery> win2 = new ArrayList<Lottery>(win);
		Collections.sort(win2);
		Set<Lottery> linkedWin = new LinkedHashSet<Lottery>(win2);
		return linkedWin;
		
	}
	public boolean searchWinner() {
		return true;
	}
}
