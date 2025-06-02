package homework.set;

import java.util.ArrayList;
import java.util.HashSet;
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
			List<Lottery> lottery2 = new ArrayList<Lottery>(lottery);
			int num = (int) (Math.random() * lottery2.size());
			return win;
		} else {
			return null;
		}
	}
	public Set<Lottery> sortedWinObject() {
		return lottery;
		
	}
	public boolean searchWinner() {
		return true;
	}
}
