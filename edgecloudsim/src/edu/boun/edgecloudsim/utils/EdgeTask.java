package edu.boun.edgecloudsim.utils;

import edu.boun.edgecloudsim.edge_client.Task;
import org.cloudbus.cloudsim.UtilizationModel;
import org.cloudbus.cloudsim.core.CloudSim;
import org.cloudbus.cloudsim.Cloudlet;
import org.cloudbus.cloudsim.UtilizationModel;
import org.cloudbus.cloudsim.core.CloudSim;


public class EdgeTask extends TaskProperty {

    private Task task;
  public EdgeTask(Task t)
  {

      super(t.getExecStartTime(), t.getMobileDeviceId(), t.getTaskType(), t.getNumberOfPes(), t.getCloudletLength(), t.getCloudletFileSize(), t.getCloudletOutputSize());
      this.task = t;
  }

  public Task getTask()
  {
      return this.task;
  }

}
