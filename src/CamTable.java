import java.util.List;

public interface CamTable {
    void addEntry(CamEntry entry);
    CamEntry getEntry(String macAddress);
    void removeEntry(String macAddress);
    List<CamEntry> getAllEntries();
}
