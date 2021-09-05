# GRAPHICS MC
*GMC*
## GraphicsMC is a plugin for rendering images and other things on maps.
### Commands
`/gmcmode <MODE>`  
Change the gmc mode to : 
- `image` for images
- `none` for the default map
- `test` for the testing mode, (all new maps will be rendered in test mode by default if this is enabled)
  
- `cam` for the webcam

*all other modes are currently unsupported*  
`/gmcrender <map_id> <arg1> <arg2> <arg *> ...`  
  
Render a specific map in the current mode with some parameters.

### Examples
`/gmcmode image`  Change into image mode  
`/gmcrender 2 IMG.png` Render *IMG.png* on map with id 2.
