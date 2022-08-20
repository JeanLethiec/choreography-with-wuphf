# WUPHF.com with Choreography
Exploration of the Choreography pattern, using the example of the infamous WUPHF.com project: sending as many notifications as possible to the same destination.
With this design, new ways to notify the destination can be added without the main application (wuphf) knowing about it.

## About this Git repository structure
In the real world this repository would be split into multiple ones: one for the notification requesting API (WUPHF), and then one for each notification system.
Here I did it this way to ease the deployment.