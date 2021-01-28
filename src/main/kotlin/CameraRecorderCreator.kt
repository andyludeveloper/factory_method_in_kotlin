class CameraRecorderCreator{
     private lateinit var cameraRecorder:ICameraRecorder

     fun record(){
         cameraRecorder = CameraRecorder()
         cameraRecorder.start()
     }
}