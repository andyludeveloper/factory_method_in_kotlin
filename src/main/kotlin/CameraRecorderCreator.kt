class CameraRecorderCreator{
     private lateinit var cameraRecorder:ICameraRecorder

     fun record(){
         cameraRecorder = createCameraRecorder()
         cameraRecorder.start()
     }

    private fun createCameraRecorder() = CameraRecorder()
}