public class Boss {
 public Boss(String healse, int uron, String zashita) {
 }

 public void setHealse(int healse) {
  this.healse = healse;
 }

 public void setUron(int uron) {
  this.uron = uron;
 }

 public void setZashita(String zashita) {
  this.zashita = zashita;
 }

 public int getHealse() {
  return healse;
 }

 public int getUron() {
  return uron;
 }

 public String getZashita() {
  return zashita;
 }

 protected int healse;
 protected int uron;
 protected String zashita;

 public Boss(int healse, int uron, String zashita) {
  this.healse = healse;
  this.uron = uron;
  this.zashita = zashita;
 }

 public Boss(int healse, int uron) {
  this.healse = healse;
  this.uron = uron;
 }
}
