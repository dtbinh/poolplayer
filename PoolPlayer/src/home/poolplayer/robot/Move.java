package home.poolplayer.robot;

public class Move {

	public double dist;
	public double direction;	
	
	public Move() {
	}
	
	public Move(double dist_, double dir_){
		dist = dist_;
		direction = dir_;
	}
	
	@Override
	public String toString() {
		return "Dist: " + dist + ", Dir: " + direction;
	}
}
