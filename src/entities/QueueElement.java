package entities;

public abstract class QueueElement {
	
	private int m_QueueId = 0;
	
	public int GetQueueId() {
		return m_QueueId;
	}
	
	public void SetQueueId(int _id) {
		m_QueueId = _id;
	}
	
}
