abstract class AbstractCameraRecorderCreator {
    protected lateinit var cameraRecorder: ICameraRecorder
    protected abstract fun createCameraRecorder(): ICameraRecorder
}